package com.taobao.mytaobao.basement.weex;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.ckf;
import tb.dde;
import tb.dun;
import tb.kpc;
import tb.kq2;
import tb.njg;
import tb.npc;
import tb.t2o;
import tb.tvh;
import tb.uv6;
import tb.z6t;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b \u0010\u001fJ/\u0010%\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010\u001aJM\u0010,\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u000e2\u0006\u0010*\u001a\u00020)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\n2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0018¢\u0006\u0004\b4\u0010\u001cJ\u0015\u00107\u001a\u00020\u00182\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108R(\u0010:\u001a\u0004\u0018\u00010\u000e2\b\u00109\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010AR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0016\u0010C\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ER!\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "bundleUrl", "initWidthPx", "initHeightPx", "Lcom/taobao/android/weex_framework/a;", "generateMUSInstance", "(Ljava/lang/String;II)Lcom/taobao/android/weex_framework/a;", "Ltb/npc;", "generateRenderDispatcher", "()Ltb/npc;", "left", "top", "right", "bottom", "Ltb/xhv;", "processOnLayoutChange", "(IIII)V", "presetViewSize", "()V", "renderListener", "addRenderListener", "(Ltb/npc;)V", "removeRenderListener", "w", "h", "oldw", "oldh", "onSizeChanged", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "wxInstance", "", "hasWeexAsyncRenderSuccess", "weexAsyncRenderErrorMsg", "setUp", "(Landroidx/lifecycle/Lifecycle;Ljava/lang/String;IILcom/taobao/android/weex_framework/a;ZLjava/lang/String;)V", "target", "eventName", "Lcom/alibaba/fastjson/JSONObject;", "data", "dispatchEvent", "(ILjava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "Ltb/dde;", "overscrollListener", "setOverScrollListener", "(Ltb/dde;)V", "<set-?>", "mInstance", "Lcom/taobao/android/weex_framework/a;", "getMInstance", "()Lcom/taobao/android/weex_framework/a;", "renderViewHeight", TLogTracker.LEVEL_INFO, "renderViewWidth", "Ltb/dde;", "Ljava/lang/String;", "mIsPresetViewSize", "Z", "Landroidx/lifecycle/Lifecycle;", "", "renderListenerList$delegate", "Ltb/njg;", "getRenderListenerList", "()Ljava/util/List;", "renderListenerList", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener$delegate", "getLayoutChangeListener", "()Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroidx/lifecycle/GenericLifecycleObserver;", "lifecycleObserver$delegate", "getLifecycleObserver", "()Landroid/arch/lifecycle/GenericLifecycleObserver;", "lifecycleObserver", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class BasementWeexView extends FrameLayout {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap _$_findViewCache;
    private String bundleUrl;
    private final njg layoutChangeListener$delegate;
    private Lifecycle lifecycle;
    private final njg lifecycleObserver$delegate;
    private com.taobao.android.weex_framework.a mInstance;
    private boolean mIsPresetViewSize;
    private dde overscrollListener;
    private final njg renderListenerList$delegate;
    private int renderViewHeight;
    private int renderViewWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kpc
        public final void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            ckf.c(view, "view");
            view.setFitsSystemWindows(false);
            TLog.loge("mtbMainLink", "BasementWeexView weexView创建回调，addWeexView");
            BasementWeexView.this.addView(view, -1, -1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                return;
            }
            for (npc npcVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                npcVar.onDestroyed(mUSDKInstance);
            }
            com.taobao.android.weex_framework.a mInstance = BasementWeexView.this.getMInstance();
            if (mInstance != null) {
                mInstance.destroy();
            }
            BasementWeexView.access$setMInstance$p(BasementWeexView.this, null);
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            for (npc npcVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                npcVar.onJSException(aVar, i, str);
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
                return;
            }
            for (npc npcVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                npcVar.onPrepareSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            for (npc npcVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                npcVar.onRefreshFailed(aVar, i, str, z);
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
                return;
            }
            for (npc npcVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                npcVar.onRefreshSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            for (npc npcVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                npcVar.onRenderFailed(aVar, i, str, z);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            for (npc npcVar : BasementWeexView.access$getRenderListenerList$p(BasementWeexView.this)) {
                npcVar.onRenderSuccess(aVar);
            }
        }
    }

    public BasementWeexView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static final /* synthetic */ com.taobao.android.weex_framework.a access$getMInstance$p(BasementWeexView basementWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("cfad4676", new Object[]{basementWeexView});
        }
        return basementWeexView.mInstance;
    }

    public static final /* synthetic */ List access$getRenderListenerList$p(BasementWeexView basementWeexView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3baa470c", new Object[]{basementWeexView});
        }
        return basementWeexView.getRenderListenerList();
    }

    public static final /* synthetic */ void access$processOnLayoutChange(BasementWeexView basementWeexView, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87acabf9", new Object[]{basementWeexView, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            basementWeexView.processOnLayoutChange(i, i2, i3, i4);
        }
    }

    public static final /* synthetic */ void access$setMInstance$p(BasementWeexView basementWeexView, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbeb820", new Object[]{basementWeexView, aVar});
        } else {
            basementWeexView.mInstance = aVar;
        }
    }

    private final npc generateRenderDispatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npc) ipChange.ipc$dispatch("7ffdfe24", new Object[]{this});
        }
        return new b();
    }

    private final View.OnLayoutChangeListener getLayoutChangeListener() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("c1be978", new Object[]{this});
        } else {
            njg njgVar = this.layoutChangeListener$delegate;
            a0g a0gVar = $$delegatedProperties[1];
            value = njgVar.getValue();
        }
        return (View.OnLayoutChangeListener) value;
    }

    private final GenericLifecycleObserver getLifecycleObserver() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("af681d0e", new Object[]{this});
        } else {
            njg njgVar = this.lifecycleObserver$delegate;
            a0g a0gVar = $$delegatedProperties[2];
            value = njgVar.getValue();
        }
        return (GenericLifecycleObserver) value;
    }

    private final List<npc> getRenderListenerList() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("5b1c7802", new Object[]{this});
        } else {
            njg njgVar = this.renderListenerList$delegate;
            a0g a0gVar = $$delegatedProperties[0];
            value = njgVar.getValue();
        }
        return (List) value;
    }

    public static /* synthetic */ Object ipc$super(BasementWeexView basementWeexView, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/basement/weex/BasementWeexView");
    }

    private final void processOnLayoutChange(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc50f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.renderViewWidth == 0 || this.renderViewHeight == 0) {
            this.renderViewWidth = i3 - i;
            this.renderViewHeight = i4 - i2;
            presetViewSize();
        }
        removeOnLayoutChangeListener(getLayoutChangeListener());
    }

    public static /* synthetic */ void setUp$default(BasementWeexView basementWeexView, Lifecycle lifecycle, String str, int i, int i2, com.taobao.android.weex_framework.a aVar, boolean z, String str2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101d8a59", new Object[]{basementWeexView, lifecycle, str, new Integer(i), new Integer(i2), aVar, new Boolean(z), str2, new Integer(i3), obj});
        } else {
            basementWeexView.setUp(lifecycle, str, i, i2, aVar, z, (i3 & 64) != 0 ? null : str2);
        }
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void addRenderListener(npc npcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93f94d9", new Object[]{this, npcVar});
            return;
        }
        ckf.h(npcVar, "renderListener");
        getRenderListenerList().add(npcVar);
    }

    public final void dispatchEvent(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f24c7ca", new Object[]{this, new Integer(i), str, jSONObject});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.mInstance;
        if (aVar != null) {
            aVar.fireEvent(i, str, jSONObject);
        }
    }

    public final void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.removeObserver(getLifecycleObserver());
        }
        this.lifecycle = null;
        getRenderListenerList().clear();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        com.taobao.android.weex_framework.a aVar = this.mInstance;
        if (aVar != null) {
            aVar.destroy();
        }
        this.mInstance = null;
    }

    public final com.taobao.android.weex_framework.a getMInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("e74796c0", new Object[]{this});
        }
        return this.mInstance;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        TLog.loge("mtbMainLink", "BasementWeexView onSizeChanged， w=" + i + " h=" + i2);
    }

    public final void removeRenderListener(npc npcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7afe9bc", new Object[]{this, npcVar});
            return;
        }
        ckf.h(npcVar, "renderListener");
        getRenderListenerList().remove(npcVar);
    }

    public final void setOverScrollListener(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d30c64", new Object[]{this, ddeVar});
            return;
        }
        ckf.h(ddeVar, "overscrollListener");
        this.overscrollListener = ddeVar;
        com.taobao.android.weex_framework.a aVar = this.mInstance;
        if (aVar != null) {
            aVar.setWeexScrollListener(ddeVar);
        }
    }

    public BasementWeexView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setUp(Lifecycle lifecycle, String str, int i, int i2, com.taobao.android.weex_framework.a aVar, boolean z, String str2) {
        com.taobao.android.weex_framework.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996ab93f", new Object[]{this, lifecycle, str, new Integer(i), new Integer(i2), aVar, new Boolean(z), str2});
            return;
        }
        ckf.h(lifecycle, "lifecycle");
        ckf.h(str, "bundleUrl");
        this.bundleUrl = str;
        z6t.S().b("WebCreat");
        if (aVar != null) {
            uv6.d("createWxInstance");
            View renderRoot = aVar.getRenderRoot();
            ckf.c(renderRoot, "v");
            renderRoot.setFitsSystemWindows(false);
            TLog.loge("mtbMainLink", "BasementWeexView addWeexView");
            addView(renderRoot, -1, -1);
            uv6.f();
            aVar2 = aVar;
        } else {
            uv6.d("createWxInstance");
            aVar2 = generateMUSInstance(str, i, i2);
            uv6.f();
            uv6.d("invokeRenderWeex");
            aVar2.initWithURL(Uri.parse(str));
            aVar2.render(null, null);
            TLog.loge("mtbMainLink", "invoke MUSInstance.render");
            uv6.f();
            if (i <= 0 || i2 <= 0) {
                addOnLayoutChangeListener(getLayoutChangeListener());
                presetViewSize();
            }
        }
        if (MtbGlobalEnv.o > 0 && MtbGlobalEnv.j()) {
            WeexApmCustomData weexApmCustomData = new WeexApmCustomData();
            weexApmCustomData.setWxCustomStartTimeStamp(MtbGlobalEnv.o);
            weexApmCustomData.setWxCustomContainerStartTimeStamp(MtbGlobalEnv.o);
            ((tvh) aVar2).j().setWeexApmCustomData(weexApmCustomData);
            MtbGlobalEnv.o = 0L;
        }
        z6t.S().e("WebCreat", null);
        z6t.S().b("WebLoad");
        npc generateRenderDispatcher = generateRenderDispatcher();
        aVar2.registerRenderListener(generateRenderDispatcher);
        if (aVar != null) {
            if (z) {
                generateRenderDispatcher.onRenderSuccess(aVar2);
                TLog.loge("mtbMainLink", "补发success");
            } else if (str2 != null) {
                generateRenderDispatcher.onRenderFailed(aVar2, 0, str2, false);
                TLog.loge("mtbMainLink", "补发error ".concat(str2));
            }
        }
        dde ddeVar = this.overscrollListener;
        if (ddeVar != null) {
            aVar2.setWeexScrollListener(ddeVar);
        }
        this.mInstance = aVar2;
        lifecycle.addObserver(getLifecycleObserver());
        this.lifecycle = lifecycle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementWeexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.h(context, "context");
        this.renderListenerList$delegate = kotlin.a.b(BasementWeexView$renderListenerList$2.INSTANCE);
        this.layoutChangeListener$delegate = kotlin.a.b(new BasementWeexView$layoutChangeListener$2(this));
        this.lifecycleObserver$delegate = kotlin.a.b(new BasementWeexView$lifecycleObserver$2(this));
    }

    private final com.taobao.android.weex_framework.a generateMUSInstance(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("7515e589", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        TLog.loge("mtbMainLink", "BasementWeexView 监听weexView创建");
        mUSInstanceConfig.u(new a());
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.v(false);
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.p(str);
        com.taobao.android.weex_framework.a c = com.taobao.android.weex_framework.b.f().c(getContext(), mUSInstanceConfig);
        if (i > 0 && i2 > 0) {
            int px2dip = DensityUtil.px2dip(getContext(), i);
            int px2dip2 = DensityUtil.px2dip(getContext(), i2);
            c.addInstanceEnv("containerWidth", String.valueOf(px2dip));
            c.addInstanceEnv("containerHeight", String.valueOf(px2dip2));
            c.setConstrainedSize(new kq2(i, i2));
        }
        ckf.c(c, "result");
        return c;
    }

    private final void presetViewSize() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fc864c", new Object[]{this});
        } else if (this.renderViewHeight != 0 && this.renderViewWidth != 0 && !this.mIsPresetViewSize && (aVar = this.mInstance) != null) {
            int px2dip = DensityUtil.px2dip(getContext(), this.renderViewWidth);
            int px2dip2 = DensityUtil.px2dip(getContext(), this.renderViewHeight);
            TLog.loge("basementLog", String.format("presetViewSize,pre set Height: %s", Arrays.copyOf(new Object[]{Integer.valueOf(px2dip2)}, 1)));
            aVar.addInstanceEnv("containerWidth", String.valueOf(px2dip));
            aVar.addInstanceEnv("containerHeight", String.valueOf(px2dip2));
            aVar.setConstrainedSize(new kq2(this.renderViewWidth, this.renderViewHeight));
            this.mIsPresetViewSize = true;
        }
    }

    static {
        t2o.a(745537641);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dun.b(BasementWeexView.class), "renderListenerList", "getRenderListenerList()Ljava/util/List;");
        dun.i(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(dun.b(BasementWeexView.class), "layoutChangeListener", "getLayoutChangeListener()Landroid/view/View$OnLayoutChangeListener;");
        dun.i(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(dun.b(BasementWeexView.class), "lifecycleObserver", "getLifecycleObserver()Landroid/arch/lifecycle/GenericLifecycleObserver;");
        dun.i(propertyReference1Impl3);
        $$delegatedProperties = new a0g[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    public /* synthetic */ BasementWeexView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
