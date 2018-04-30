package co.kr.modublog;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BannerAdapter extends PagerAdapter {
    Context mContext;
    private static final String imageurl = "http://192.168.0.216/testa/test_image.php";

    public BannerAdapter(Context context) {
        super();
        mContext = context;
    }

    private int[] main_images=new int[]{};

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        int pos = position % 5;
        View v = LayoutInflater.from(container.getContext()).inflate(R.layout.mainview,null);
        ((ViewPager)container).addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View)object);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

}

