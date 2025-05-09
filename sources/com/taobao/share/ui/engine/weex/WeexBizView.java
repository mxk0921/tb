package com.taobao.share.ui.engine.weex;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.fwr;
import tb.t2o;
import tb.upd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WeexBizView extends FrameLayout implements upd.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean fixWeexBizViewListenerLeak;
    private static WeakReference<a> listenerRef = null;
    public static Map<String, String> params;
    private static a sListener;
    private upd.b mInstance;
    private a mListener;
    private View mView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(String str, Map<String, String> map);

        void b(WeexBizView weexBizView);

        void c(WeexBizView weexBizView, View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b extends a {
        void close();
    }

    public WeexBizView(Context context) {
        super(context);
    }

    public static void close() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[0]);
            return;
        }
        if (fixWeexBizViewListenerLeak) {
            WeakReference<a> weakReference = listenerRef;
            if (weakReference == null) {
                aVar = null;
            } else {
                aVar = weakReference.get();
            }
        } else {
            aVar = sListener;
        }
        if (aVar instanceof b) {
            ((b) aVar).close();
            sListener = null;
            listenerRef = null;
        }
    }

    public static void closeWithParam(String str, Map<String, String> map) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b065e5", new Object[]{str, map});
            return;
        }
        if (fixWeexBizViewListenerLeak) {
            WeakReference<a> weakReference = listenerRef;
            if (weakReference == null) {
                aVar = null;
            } else {
                aVar = weakReference.get();
            }
        } else {
            aVar = sListener;
        }
        if (aVar != null) {
            aVar.a(str, map);
            sListener = null;
            listenerRef = null;
        }
    }

    private a getListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7dcfc8bf", new Object[]{this});
        }
        if (fixWeexBizViewListenerLeak) {
            return this.mListener;
        }
        return sListener;
    }

    public static /* synthetic */ Object ipc$super(WeexBizView weexBizView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/share/ui/engine/weex/WeexBizView");
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mView = null;
        sListener = null;
        this.mListener = null;
        listenerRef = null;
        upd.b bVar = this.mInstance;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    public void init(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb90491", new Object[]{this, aVar});
        } else {
            init(getContext(), aVar, "");
        }
    }

    public void initBackFlow(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5b6930", new Object[]{this, aVar, str});
            return;
        }
        if (fixWeexBizViewListenerLeak) {
            this.mListener = aVar;
            listenerRef = new WeakReference<>(this.mListener);
        } else {
            sListener = aVar;
        }
        upd shareBackWeexSdk = ShareBizAdapter.getInstance().getShareBackWeexSdk(str);
        if (shareBackWeexSdk != null) {
            shareBackWeexSdk.f();
            this.mInstance = shareBackWeexSdk.c(getContext(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (fixWeexBizViewListenerLeak && this.mListener != null) {
            listenerRef = new WeakReference<>(this.mListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        upd.b bVar = this.mInstance;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    public void render(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abb30fe", new Object[]{this, str, map});
            return;
        }
        fwr.d("调用WeexBizView#render");
        if (TextUtils.isEmpty(str)) {
            fwr.d("【异常】weex url empty");
            a listener = getListener();
            if (listener != null) {
                listener.b(this);
                return;
            }
            return;
        }
        params = map;
        upd.b bVar = this.mInstance;
        if (bVar != null) {
            bVar.a(toString(), str, map, null, getWidth(), getHeight());
        }
    }

    @Override // tb.upd.a
    public void viewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e15508", new Object[]{this, view});
            return;
        }
        fwr.d("调用WeexBizView#viewCreated");
        this.mView = view;
    }

    @Override // tb.upd.a
    public void viewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b01e385", new Object[]{this});
            return;
        }
        fwr.d("【成功】weexRenderSuccess,当前页面为:".concat(getContext().getClass().getSimpleName()));
        if (this.mView.getParent() != null) {
            fwr.d("【异常】weex view已有parent");
            return;
        }
        addView(this.mView);
        a listener = getListener();
        if (listener != null) {
            listener.c(this, this.mView);
        }
    }

    @Override // tb.upd.a
    public void weexError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7396a5d8", new Object[]{this, str});
            return;
        }
        upd.b bVar = this.mInstance;
        if (bVar != null) {
            bVar.destroy();
        }
        setTag(str);
        fwr.d("weexError:" + str);
        a listener = getListener();
        if (listener != null) {
            listener.b(this);
        }
    }

    public WeexBizView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b468c1b", new Object[]{this, aVar, str});
        } else {
            init(getContext(), aVar, str);
        }
    }

    public WeexBizView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void init(Context context, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e24215", new Object[]{this, context, aVar, str});
            return;
        }
        if (fixWeexBizViewListenerLeak) {
            this.mListener = aVar;
            listenerRef = new WeakReference<>(this.mListener);
        } else {
            sListener = aVar;
        }
        upd shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk(str);
        if (shareWeexSdk != null) {
            shareWeexSdk.f();
            this.mInstance = shareWeexSdk.c(context, this);
        }
    }

    static {
        t2o.a(667942977);
        t2o.a(665845812);
        fixWeexBizViewListenerLeak = false;
        fixWeexBizViewListenerLeak = "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixWeexBizViewListenerLeak", "true"));
        fwr.d("fixWeexBizViewListenerLeak=" + fixWeexBizViewListenerLeak);
    }

    public void render(String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6215748", new Object[]{this, str, map, str2});
            return;
        }
        fwr.d("调用WeexBizView#render");
        if (TextUtils.isEmpty(str)) {
            fwr.d("【异常】weex url empty");
            a listener = getListener();
            if (listener != null) {
                listener.b(this);
                return;
            }
            return;
        }
        upd.b bVar = this.mInstance;
        if (bVar != null) {
            bVar.a(toString(), str, map, str2, getWidth(), getHeight());
        }
    }
}
