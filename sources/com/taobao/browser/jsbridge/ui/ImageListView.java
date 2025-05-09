package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import java.util.Iterator;
import tb.s0m;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImageListView extends ListView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext = null;
    private ImageStrategyConfig mConfig = ImageStrategyConfig.v("windvane", 98).a();
    public ArrayList<String> mImgUrls = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ImageAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private RatioImageViewEX imageview;
        private Context mContext;

        static {
            t2o.a(619708574);
        }

        public ImageAdapter(Context context) {
            this.mContext = context.getApplicationContext();
        }

        public static /* synthetic */ Context access$100(ImageAdapter imageAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("977b5cef", new Object[]{imageAdapter});
            }
            return imageAdapter.mContext;
        }

        public static /* synthetic */ Object ipc$super(ImageAdapter imageAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/ImageListView$ImageAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            ArrayList<String> arrayList = ImageListView.this.mImgUrls;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                this.imageview = new RatioImageViewEX(this.mContext);
            } else {
                this.imageview = (RatioImageViewEX) view;
            }
            final String str = ImageListView.this.mImgUrls.get(i);
            ImageStrategyDecider.decideUrl(str, 2000, 2000, ImageListView.access$000(ImageListView.this));
            s0m.B().T(str).into(this.imageview);
            this.imageview.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.browser.jsbridge.ui.ImageListView.ImageAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                    }
                    if (TextUtils.isEmpty(str) || ImageAdapter.access$100(ImageAdapter.this) == null) {
                        v7t.d("ImageListView", "save image param error");
                        return false;
                    }
                    TBImageSaveView.getInstance().save(str, ImageAdapter.access$100(ImageAdapter.this), view2);
                    return true;
                }
            });
            return this.imageview;
        }
    }

    static {
        t2o.a(619708573);
    }

    public ImageListView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ ImageStrategyConfig access$000(ImageListView imageListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("acc14f09", new Object[]{imageListView});
        }
        return imageListView.mConfig;
    }

    public static /* synthetic */ Object ipc$super(ImageListView imageListView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/ImageListView");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mImgUrls = null;
        this.mContext = null;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setAdapter((ListAdapter) new ImageAdapter(context));
        this.mContext = context;
    }

    public boolean setImageUrls(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba4d278a", new Object[]{this, arrayList})).booleanValue();
        }
        this.mImgUrls.clear();
        if (arrayList == null) {
            return false;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            this.mImgUrls.add(it.next());
        }
        return true;
    }

    public ImageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ImageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
