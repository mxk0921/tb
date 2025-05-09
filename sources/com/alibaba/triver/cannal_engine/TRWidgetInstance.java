package com.alibaba.triver.cannal_engine;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.manager.TRWidgetInstanceManager;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.ui.flat.widget.Widget;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bcq;
import tb.f7l;
import tb.fbx;
import tb.fks;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetInstance implements Serializable, ITRWidgetInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int index = 0;
    private static final String widgetUrlPath = "https://m.duanqu.com?isCanal=true&_ariver_appid=";
    private volatile boolean hasAttached;
    private Activity mActivity;
    private List<d> mDestroyListeners;
    private Fragment mFragment;
    private String mGroupId;
    private String mInstanceId;
    private volatile boolean mIsDestroy;
    private ITRWidgetInstance mRenderImpl;
    private c mRenderListener;
    private WidgetRenderContainer mRootContainer;
    private String mTag;
    private e mWidgetExceptionListener;
    private f mWidgetInitListener;
    private g mWidgetJSLogListener;
    private h mWidgetMonitorListener;
    private i mWidgetRenderListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ITriverRemoteProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WidgetStartParams f2932a;
        public final /* synthetic */ c b;

        public a(WidgetStartParams widgetStartParams, c cVar) {
            this.f2932a = widgetStartParams;
            this.b = cVar;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errorMsg", str);
            TRWidgetInstance.access$300(TRWidgetInstance.this, TRWidgetConstant.CL_REMOTE_DOWNLOAD_FAILED, hashMap);
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (!TRWidgetInstance.access$000(TRWidgetInstance.this)) {
                if (TRWidgetInstance.access$100(TRWidgetInstance.this) != null) {
                    RVLogger.e("TRWidget", "installRemoteContextResource : " + TRWidgetInstance.access$100(TRWidgetInstance.this));
                    bcq.a().f(TRWidgetInstance.access$100(TRWidgetInstance.this), "triver_taobao");
                }
                TRWidgetInstance.access$200(TRWidgetInstance.this, this.f2932a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements ITriverRemoteProxy.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f2933a;

        public b(TRWidgetInstance tRWidgetInstance, TextView textView) {
            this.f2933a = textView;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e93d99cc", new Object[]{this, new Integer(i)});
                return;
            }
            TextView textView = this.f2933a;
            if (textView != null) {
                textView.setText(i + f7l.MOD);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        void a(boolean z);

        void b(String str, JSONObject jSONObject);

        void c(JSONObject jSONObject);

        void d(String str);

        void e(fks fksVar, Map<String, String> map);

        void f(MotionEvent motionEvent);

        void g(String str);

        void onRenderSuccess(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        void onDestroy();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface e {
        void a(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface f {
        void a(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface g {
        void d(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface h {
        void b(String str, JSONObject jSONObject);

        void c(JSONObject jSONObject);

        void f(MotionEvent motionEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface i {
        void e(fks fksVar, Map<String, String> map);

        void onRenderSuccess(View view);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TRWidgetConstant.WidgetState f2934a;

        public TRWidgetConstant.WidgetState a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TRWidgetConstant.WidgetState) ipChange.ipc$dispatch("3ae1381d", new Object[]{this});
            }
            return this.f2934a;
        }

        public void b(TRWidgetConstant.WidgetState widgetState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58783b7f", new Object[]{this, widgetState});
            } else {
                this.f2934a = widgetState;
            }
        }
    }

    public TRWidgetInstance(FragmentActivity fragmentActivity) {
        this(fragmentActivity, "", "");
    }

    public static /* synthetic */ boolean access$000(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23dcdb8a", new Object[]{tRWidgetInstance})).booleanValue();
        }
        return tRWidgetInstance.mIsDestroy;
    }

    public static /* synthetic */ Activity access$100(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2fb27123", new Object[]{tRWidgetInstance});
        }
        return tRWidgetInstance.mActivity;
    }

    public static /* synthetic */ void access$200(TRWidgetInstance tRWidgetInstance, WidgetStartParams widgetStartParams, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d328d404", new Object[]{tRWidgetInstance, widgetStartParams, cVar});
        } else {
            tRWidgetInstance.doRenderInner(widgetStartParams, cVar);
        }
    }

    public static /* synthetic */ void access$300(TRWidgetInstance tRWidgetInstance, fks fksVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5c98c4", new Object[]{tRWidgetInstance, fksVar, map});
        } else {
            tRWidgetInstance.dispatchRenderError(fksVar, map);
        }
    }

    private void dispatchRenderError(fks fksVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6a3ea0", new Object[]{this, fksVar, map});
            return;
        }
        c cVar = this.mRenderListener;
        if (cVar != null) {
            cVar.e(fksVar, map);
        }
        i iVar = this.mWidgetRenderListener;
        if (iVar != null) {
            iVar.e(fksVar, map);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestroy = true;
        try {
            TRWidgetInstanceManager.d().e(this.mGroupId).remove(this.mInstanceId);
        } catch (Throwable th) {
            RVLogger.e(this.mTag, th);
        }
        try {
            for (d dVar : this.mDestroyListeners) {
                dVar.onDestroy();
            }
            this.mDestroyListeners.clear();
        } catch (Throwable th2) {
            RVLogger.e(this.mTag, th2);
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.destroy();
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public App getApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (App) ipChange.ipc$dispatch("cd179cf8", new Object[]{this});
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            return iTRWidgetInstance.getApp();
        }
        return null;
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
        }
        return this.mGroupId;
    }

    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.mInstanceId;
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.mRootContainer;
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public JSONObject getWidgetMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53d65667", new Object[]{this});
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            return iTRWidgetInstance.getWidgetMonitor();
        }
        return new JSONObject();
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public j getWidgetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("7672cac2", new Object[]{this});
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            return iTRWidgetInstance.getWidgetState();
        }
        return new j();
    }

    public Boolean hasAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ea4f2222", new Object[]{this});
        }
        return Boolean.valueOf(this.hasAttached);
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void onAttach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb770c5", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = true;
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.onAttach(jSONObject);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void onDetach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8da037", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = false;
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.onDetach(jSONObject);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void onVisibilityChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i2)});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.onVisibilityChanged(i2);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.pause();
        }
    }

    public void registerDestroyListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e0f245", new Object[]{this, dVar});
        } else if (dVar != null) {
            this.mDestroyListeners.add(dVar);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetExceptionListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396ef77f", new Object[]{this, eVar});
        } else {
            this.mWidgetExceptionListener = eVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetInitListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b382dd9", new Object[]{this, fVar});
        } else {
            this.mWidgetInitListener = fVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetJSLogListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0187ae7", new Object[]{this, gVar});
        } else {
            this.mWidgetJSLogListener = gVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetMonitorListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40839a9", new Object[]{this, hVar});
        } else {
            this.mWidgetMonitorListener = hVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetRenderListener(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2665a819", new Object[]{this, iVar});
        } else {
            this.mWidgetRenderListener = iVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void render(WidgetStartParams widgetStartParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8d97b8", new Object[]{this, widgetStartParams});
        } else {
            render(widgetStartParams, (c) null);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.resume();
        }
    }

    public void setAttachStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0236b4", new Object[]{this, new Boolean(z)});
        } else {
            this.hasAttached = z;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void setFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ddd551", new Object[]{this, fragment});
        } else {
            this.mFragment = fragment;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void setRootContainer(WidgetRenderContainer widgetRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49eb24ae", new Object[]{this, widgetRenderContainer});
        } else {
            this.mRootContainer = widgetRenderContainer;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.stop();
        }
    }

    public void unregisterDestroyListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac2205e", new Object[]{this, dVar});
        } else if (dVar != null) {
            this.mDestroyListeners.remove(dVar);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void updateSize(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1856811", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.updateSize(i2, i3);
        }
    }

    public TRWidgetInstance(FragmentActivity fragmentActivity, String str) {
        this(fragmentActivity, str, "");
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void render(WidgetStartParams widgetStartParams, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f5d9dd", new Object[]{this, widgetStartParams, cVar});
            return;
        }
        this.mRenderListener = cVar;
        if (this.mRootContainer == null && this.mActivity != null) {
            this.mRootContainer = new WidgetRenderContainer(this.mActivity);
        }
        ITriverRemoteProxy.DependenceMode dependenceMode = ITriverRemoteProxy.DependenceMode.TRIVER_ONLY;
        TextView textView = null;
        if (!com.alibaba.android.triver.base.api.a.a(dependenceMode, this.mActivity)) {
            View inflate = View.inflate(this.mActivity, R.layout.triver_widget_loading_view, null);
            textView = (TextView) inflate.findViewById(R.id.loadingPerct);
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.appLogo);
            if (widgetStartParams.getHeight() > 300) {
                tUrlImageView.setSkipAutoSize(true);
                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01yeqsKh1YnDpkw5F9M_!!6000000003103-1-tps-153-153.gif");
            } else {
                tUrlImageView.setVisibility(8);
            }
            this.mRootContainer.addView(inflate);
        }
        com.alibaba.android.triver.base.api.a.c(Widget.TAG, widgetUrlPath + widgetStartParams.getWidgetId(), dependenceMode, this.mActivity, new a(widgetStartParams, cVar), new b(this, textView));
    }

    public TRWidgetInstance(FragmentActivity fragmentActivity, String str, String str2) {
        this.mTag = "TRWidget";
        this.mGroupId = "default";
        this.hasAttached = false;
        this.mIsDestroy = false;
        this.mDestroyListeners = new CopyOnWriteArrayList();
        this.mActivity = fragmentActivity;
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder("widget");
            int i2 = index;
            index = i2 + 1;
            sb.append(i2);
            str2 = sb.toString();
        }
        this.mInstanceId = str2;
        if (!TextUtils.isEmpty(str)) {
            this.mGroupId = str;
        }
        TRWidgetInstanceManager.d().e(this.mGroupId).put(this.mInstanceId, new WeakReference<>(this));
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void updateSize(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89727d1f", new Object[]{this, jSONObject});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            iTRWidgetInstance.updateSize(jSONObject);
        }
    }

    private void doRenderInner(WidgetStartParams widgetStartParams, c cVar) {
        try {
            this.mRenderImpl = (ITRWidgetInstance) Class.forName("com.alibaba.triver.cannal_engine.TRWidgetInstanceImpl").getConstructor(FragmentActivity.class, String.class, String.class).newInstance(this.mActivity, this.mGroupId, this.mInstanceId);
        } catch (Throwable th) {
            RVLogger.e(this.mTag, th);
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorMsg", "new RenderImpl failed");
            dispatchRenderError(TRWidgetConstant.CL_REMOTE_DOWNLOAD_FAILED, hashMap);
            return;
        }
        iTRWidgetInstance.setRootContainer(this.mRootContainer);
        this.mRenderImpl.setFragment(this.mFragment);
        this.mRenderImpl.registerWidgetRenderListener(this.mWidgetRenderListener);
        this.mRenderImpl.registerWidgetInitListener(this.mWidgetInitListener);
        this.mRenderImpl.registerWidgetExceptionListener(this.mWidgetExceptionListener);
        this.mRenderImpl.registerWidgetJSLogListener(this.mWidgetJSLogListener);
        this.mRenderImpl.registerWidgetMonitorListener(this.mWidgetMonitorListener);
        this.mRenderImpl.render(widgetStartParams, cVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2935a;
        public int b;
        public final int c;
        public final int d;
        public int e;

        public k(int i, int i2) {
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.b = i;
            this.f2935a = i2;
        }

        /* renamed from: a */
        public k clone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("1fa55c36", new Object[]{this});
            }
            return new k(this);
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            int i = this.f2935a;
            if (i == -1) {
                return i;
            }
            return fbx.d(this.e, i, -1);
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("632e55d", new Object[]{this})).intValue();
            }
            return this.f2935a;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9294c84", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
            }
            return this.e;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8a7ce05c", new Object[]{this})).intValue();
            }
            return fbx.d(this.e, this.c, 0);
        }

        public int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8a8af7dd", new Object[]{this})).intValue();
            }
            return fbx.d(this.e, this.d, 0);
        }

        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            int i = this.b;
            if (i == -1) {
                return i;
            }
            return fbx.d(this.e, i, -1);
        }

        public void i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2768ff64", new Object[]{this, new Integer(i)});
            } else {
                this.e = i;
            }
        }

        public k(k kVar) {
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.b = kVar.b;
            this.f2935a = kVar.f2935a;
            this.c = kVar.c;
            this.d = kVar.d;
        }

        public k(WidgetStartParams widgetStartParams) {
            this.c = 0;
            this.d = 0;
            this.e = -1;
            if (widgetStartParams != null) {
                this.b = widgetStartParams.getWidth();
                this.f2935a = widgetStartParams.getHeight();
                this.c = widgetStartParams.getVisualX();
                this.d = widgetStartParams.getVisualY();
            }
        }
    }

    @Deprecated
    public void render(WidgetStartParams widgetStartParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e626121c", new Object[]{this, widgetStartParams, new Boolean(z)});
        } else {
            render(widgetStartParams);
        }
    }
}
