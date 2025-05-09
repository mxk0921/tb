package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.IconBean;
import com.taobao.search.mmd.datasource.bean.ListStyle;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f26746a = qh1.class.getSimpleName();
    public static final int b;
    public static final int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26747a;
        public final /* synthetic */ int b;
        public final /* synthetic */ TextView c;
        public final /* synthetic */ AuctionBaseBean d;
        public final /* synthetic */ ListStyle e;
        public final /* synthetic */ boolean f;

        public a(int i, int i2, TextView textView, AuctionBaseBean auctionBaseBean, ListStyle listStyle, boolean z) {
            this.f26747a = i;
            this.b = i2;
            this.c = textView;
            this.d = auctionBaseBean;
            this.e = listStyle;
            this.f = z;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null && !succPhenixEvent.isIntermediate()) {
                drawable.setBounds(0, 0, this.f26747a, this.b);
                qh1.a(this.c, this.d, drawable, this.e, this.f);
            }
            return true;
        }
    }

    static {
        t2o.a(815792594);
        Resources resources = Globals.getApplication().getResources();
        b = resources.getColor(R.color.tbsearch_auction_title);
        c = resources.getColor(R.color.list_item_click_title_color);
    }

    public static /* synthetic */ void a(TextView textView, AuctionBaseBean auctionBaseBean, Drawable drawable, ListStyle listStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dd9bba", new Object[]{textView, auctionBaseBean, drawable, listStyle, new Boolean(z)});
        } else {
            k(textView, auctionBaseBean, drawable, listStyle, z);
        }
    }

    public static IconBean d(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconBean) ipChange.ipc$dispatch("f5d4ab3", new Object[]{auctionBaseBean});
        }
        List<IconBean> list = auctionBaseBean.videoIconList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return auctionBaseBean.videoIconList.get(0);
    }

    public static IconBean e(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconBean) ipChange.ipc$dispatch("2ee7d465", new Object[]{auctionBaseBean});
        }
        List<IconBean> list = auctionBaseBean.titleIconList;
        if (list == null || list.size() == 0) {
            return null;
        }
        return auctionBaseBean.titleIconList.get(0);
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1170a0e3", new Object[]{spannableStringBuilder, drawable});
        } else if (drawable != null) {
            spannableStringBuilder.insert(0, "  ");
            spannableStringBuilder.setSpan(new eh3(drawable), 0, 1, 33);
        }
    }

    public static SpannableStringBuilder h(AuctionBaseBean auctionBaseBean, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("d0118c26", new Object[]{auctionBaseBean, listStyle});
        }
        String str = auctionBaseBean.title;
        if (listStyle == ListStyle.WATERFALL && !TextUtils.isEmpty(auctionBaseBean.wfTitle)) {
            str = auctionBaseBean.wfTitle;
        }
        if (TextUtils.isEmpty(auctionBaseBean.preTitleText) || TextUtils.isEmpty(auctionBaseBean.preTitleColor)) {
            return new SpannableStringBuilder(str);
        }
        return yvr.a(str, auctionBaseBean.preTitleText, auctionBaseBean.preTitleColor);
    }

    public static void i(TextView textView, AuctionBaseBean auctionBaseBean, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3fedacc", new Object[]{textView, auctionBaseBean, listStyle});
        } else {
            j(textView, auctionBaseBean, listStyle, false, o4p.O0());
        }
    }

    public static void j(TextView textView, AuctionBaseBean auctionBaseBean, ListStyle listStyle, boolean z, boolean z2) {
        IconBean iconBean;
        SearchDomBean searchDomBean;
        SearchDomBean searchDomBean2;
        IconBean iconBean2;
        int i;
        int i2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6da5f0f", new Object[]{textView, auctionBaseBean, listStyle, new Boolean(z), new Boolean(z2)});
        } else if (auctionBaseBean == null) {
            Log.e(f26746a, "auction is null");
        } else {
            SearchDomBean searchDomBean3 = null;
            k(textView, auctionBaseBean, null, listStyle, z2);
            if (z) {
                iconBean = d(auctionBaseBean);
                if (iconBean == null) {
                    searchDomBean = null;
                } else {
                    searchDomBean = iconBean.searchDomBean;
                }
            } else {
                iconBean = null;
                searchDomBean = null;
            }
            if (searchDomBean == null) {
                IconBean e = e(auctionBaseBean);
                if (e != null) {
                    searchDomBean3 = e.searchDomBean;
                }
                iconBean2 = e;
                searchDomBean2 = searchDomBean3;
                z3 = false;
            } else {
                iconBean2 = iconBean;
                searchDomBean2 = searchDomBean;
            }
            if (b(iconBean2, searchDomBean2)) {
                Context context = textView.getContext();
                if (!(context instanceof pec) || !((pec) context).x0()) {
                    i = DensityUtil.dip2px(context, 12.0f);
                } else {
                    i = DensityUtil.dip2px(context, 14.0f);
                }
                int dip2px = DensityUtil.dip2px(context, 16.0f);
                if (z3) {
                    i2 = dip2px;
                } else {
                    i2 = i;
                }
                g(textView, auctionBaseBean, iconBean2, searchDomBean2, listStyle, i2, z2);
            }
        }
    }

    public static void c(TextView textView, SpannableStringBuilder spannableStringBuilder, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bc0742", new Object[]{textView, spannableStringBuilder, drawable});
            return;
        }
        for (int length = spannableStringBuilder.length() - 2; length > 0; length -= 2) {
            spannableStringBuilder.insert(length, "\u200b");
        }
    }

    public static boolean b(IconBean iconBean, SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe1a5460", new Object[]{iconBean, searchDomBean})).booleanValue();
        }
        if (!(searchDomBean == null || iconBean == null)) {
            if (TextUtils.equals("text", iconBean.type)) {
                return true;
            }
            if (searchDomBean.width <= 0 || searchDomBean.height <= 0) {
                Log.e(f26746a, "icon size is invalid");
            } else if (!TextUtils.isEmpty(searchDomBean.image)) {
                return true;
            } else {
                Log.e(f26746a, "icon url is empty");
                return false;
            }
        }
        return false;
    }

    public static void g(TextView textView, AuctionBaseBean auctionBaseBean, IconBean iconBean, SearchDomBean searchDomBean, ListStyle listStyle, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6beb746c", new Object[]{textView, auctionBaseBean, iconBean, searchDomBean, listStyle, new Integer(i), new Boolean(z)});
        } else if (searchDomBean == null) {
            Log.e(f26746a, "dom is null");
            textView.setVisibility(4);
        } else if (TextUtils.equals(iconBean.type, "text")) {
            llt lltVar = new llt(iconBean, searchDomBean);
            lltVar.setBounds(0, 0, lltVar.getIntrinsicWidth(), lltVar.getIntrinsicHeight());
            k(textView, auctionBaseBean, lltVar, listStyle, z);
        } else {
            s0m.B().T(searchDomBean.image).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "8920").succListener(new a((searchDomBean.width * i) / searchDomBean.height, i, textView, auctionBaseBean, listStyle, z)).fetch();
        }
    }

    public static void k(TextView textView, AuctionBaseBean auctionBaseBean, Drawable drawable, ListStyle listStyle, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b6a9f6", new Object[]{textView, auctionBaseBean, drawable, listStyle, new Boolean(z)});
        } else if (auctionBaseBean == null) {
            Log.e(f26746a, "auction is null");
            textView.setVisibility(4);
        } else if (TextUtils.isEmpty(auctionBaseBean.title)) {
            Log.e(f26746a, "title is empty");
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            SpannableStringBuilder h = h(auctionBaseBean, listStyle);
            textView.setContentDescription(h);
            if (h == null) {
                Log.e(f26746a, "span is null");
                String str = auctionBaseBean.title;
                if (listStyle == ListStyle.WATERFALL && !TextUtils.isEmpty(auctionBaseBean.wfTitle)) {
                    str = auctionBaseBean.wfTitle;
                }
                textView.setText(str);
                return;
            }
            f(h, drawable);
            if (z) {
                c(textView, h, drawable);
            }
            textView.setText(h, TextView.BufferType.SPANNABLE);
            if (auctionBaseBean.isClicked) {
                i = c;
            } else {
                i = b;
            }
            textView.setTextColor(i);
        }
    }
}
