package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.ut.share.utils.RumManager;
import tb.j6x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareScrollViewView extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static WeexInstance wxsdkInstance = null;
    private String TAG;
    private Context mContext;
    public String weexUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            } else {
                ShareScrollViewView.access$000(ShareScrollViewView.this);
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            ShareScrollViewView.access$000(ShareScrollViewView.this);
            new StringBuilder("onRenderFailed:").append(str);
            ShareScrollViewView.this.clear();
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            } else {
                ShareScrollViewView.access$000(ShareScrollViewView.this);
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            } else {
                ShareScrollViewView.access$000(ShareScrollViewView.this);
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
            } else {
                ShareScrollViewView.access$000(ShareScrollViewView.this);
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                ShareScrollViewView.access$000(ShareScrollViewView.this);
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                ShareScrollViewView.access$000(ShareScrollViewView.this);
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            } else {
                ShareScrollViewView.access$000(ShareScrollViewView.this);
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            ShareScrollViewView.access$000(ShareScrollViewView.this);
            ShareScrollViewView.this.clear();
        }
    }

    static {
        t2o.a(666894599);
    }

    public ShareScrollViewView(Context context, String str, float f, float f2) {
        super(context);
        this.TAG = "ShareScrollViewView";
        this.mContext = context;
        this.weexUrl = str;
        setFillViewport(true);
        setEnabled(true);
        initWeexView(f, f2);
    }

    public static /* synthetic */ String access$000(ShareScrollViewView shareScrollViewView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e54ee3da", new Object[]{shareScrollViewView});
        }
        return shareScrollViewView.TAG;
    }

    private WeexInstance generateWeexInstance(String str, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("c165ddd8", new Object[]{this, str, new Float(f), new Float(f2)});
        }
        WeexInstance weexInstance = wxsdkInstance;
        if (weexInstance != null) {
            return weexInstance;
        }
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        RumManager.configEnableEmbedPresentMode(weexInstanceConfig);
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexInstanceConfig.s(weexUnicornConfig);
        weexUnicornConfig.j(null);
        weexUnicornConfig.k(true);
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        wxsdkInstance = b.a(this.mContext, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        try {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.addView(wxsdkInstance.getRootView());
            wxsdkInstance.getRootView().setFocusable(false);
            wxsdkInstance.getRootView().setFocusableInTouchMode(true);
            addView(linearLayout, layoutParams);
        } catch (Throwable unused) {
        }
        wxsdkInstance.addInstanceListener(new a());
        return wxsdkInstance;
    }

    public static /* synthetic */ Object ipc$super(ShareScrollViewView shareScrollViewView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/sharepanel/weex/component/ShareScrollViewView");
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = wxsdkInstance;
        if (weexInstance != null) {
            weexInstance.destroy();
            wxsdkInstance = null;
        }
    }

    public void initWeexView(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dba5bd", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        try {
            WeexInstance generateWeexInstance = generateWeexInstance(this.weexUrl, f, f2);
            wxsdkInstance = generateWeexInstance;
            generateWeexInstance.initWithURL(this.weexUrl);
            wxsdkInstance.render(null);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        clear();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            int height = getChildAt(0).getHeight();
            StringBuilder sb = new StringBuilder("getChildAt height:");
            sb.append(height);
            sb.append(" getLayoutParams height:");
            sb.append(getLayoutParams().height);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        StringBuilder sb = new StringBuilder("onScrollChanged l, t, oldl, oldt:");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
    }

    public ShareScrollViewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.weexUrl = null;
        this.TAG = "ShareScrollViewView";
    }

    public ShareScrollViewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.weexUrl = null;
        this.TAG = "ShareScrollViewView";
    }
}
