package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.h5tabframe;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.fkx;
import tb.jbu;
import tb.pu;
import tb.qoa;
import tb.t2o;
import tb.t54;
import tb.ukr;
import tb.up6;
import tb.ux9;
import tb.v2s;
import tb.wbc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class H5TabFrame extends BaseFrame implements wbc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DP2_MODULE = "TLiveGoodH5Tab";
    private static final String DP2_MONITOR_POINT = "liveroomGoodsH5Render";
    private static final String H5_CONTAINER_ERROR_RENDER_TIMEOUT = "renderTimeout";
    private static final String TAG = "H5TabFrame";
    private qoa h5Container;
    private String resultUrl;
    private View retryLayout;
    private View webViewLayout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (H5TabFrame.access$000(H5TabFrame.this) != null) {
                H5TabFrame.access$000(H5TabFrame.this).o(H5TabFrame.access$100(H5TabFrame.this));
            }
            if (H5TabFrame.access$200(H5TabFrame.this) != null) {
                H5TabFrame.access$200(H5TabFrame.this).setVisibility(0);
            }
            if (H5TabFrame.access$300(H5TabFrame.this) != null) {
                H5TabFrame.access$300(H5TabFrame.this).setVisibility(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements pu.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f8684a;

        public b(Map map) {
            this.f8684a = map;
        }

        @Override // tb.pu.b
        public void renderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c8590be", new Object[]{this, view});
                return;
            }
            jbu.a(H5TabFrame.TAG, "[init] renderSuccess view = " + view.toString());
            if (H5TabFrame.access$200(H5TabFrame.this) != null) {
                H5TabFrame.access$200(H5TabFrame.this).setBackgroundColor(0);
                H5TabFrame.access$200(H5TabFrame.this).setVisibility(0);
            }
            H5TabFrame.access$000(H5TabFrame.this).u();
            v2s.o().e().commitSuccess(H5TabFrame.DP2_MODULE, H5TabFrame.DP2_MONITOR_POINT, fkx.i(this.f8684a));
        }

        @Override // tb.pu.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b312762d", new Object[]{this, str, str2});
            } else if (H5TabFrame.H5_CONTAINER_ERROR_RENDER_TIMEOUT.equals(str)) {
                jbu.a(H5TabFrame.TAG, "[init] renderError errorCode = " + str + ", errorMsg = " + str2);
                H5TabFrame h5TabFrame = H5TabFrame.this;
                if (h5TabFrame.mContainer != null) {
                    H5TabFrame.access$200(h5TabFrame).setVisibility(8);
                }
                if (H5TabFrame.access$300(H5TabFrame.this) != null) {
                    H5TabFrame.access$300(H5TabFrame.this).setVisibility(0);
                }
                v2s.o().e().commitFail(H5TabFrame.DP2_MODULE, H5TabFrame.DP2_MONITOR_POINT, fkx.i(this.f8684a), str, str2);
            }
        }
    }

    static {
        t2o.a(295699931);
        t2o.a(806356115);
    }

    public H5TabFrame(Context context) {
        super(context);
    }

    public static /* synthetic */ qoa access$000(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoa) ipChange.ipc$dispatch("8956bd5a", new Object[]{h5TabFrame});
        }
        return h5TabFrame.h5Container;
    }

    public static /* synthetic */ String access$100(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f94e9867", new Object[]{h5TabFrame});
        }
        return h5TabFrame.resultUrl;
    }

    public static /* synthetic */ View access$200(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d4c83a9c", new Object[]{h5TabFrame});
        }
        return h5TabFrame.webViewLayout;
    }

    public static /* synthetic */ View access$300(H5TabFrame h5TabFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ae9207dd", new Object[]{h5TabFrame});
        }
        return h5TabFrame.retryLayout;
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qoa qoaVar = this.h5Container;
        if (qoaVar != null) {
            qoaVar.i();
            this.h5Container = null;
        }
        View view = this.mContainer;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
    }

    private IInteractiveProxy.h getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInteractiveProxy.h) ipChange.ipc$dispatch("d5cdd132", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof t54) {
            return ((t54) ux9Var).z0();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(H5TabFrame h5TabFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/room/h5tabframe/H5TabFrame");
        }
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mContainer;
    }

    public void init(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            jbu.a(TAG, "[init] url empty");
        } else {
            jbu.a(TAG, "[init] url: " + str);
            this.resultUrl = str;
            IInteractiveProxy.h tBLiveInteractiveManager = getTBLiveInteractiveManager();
            if (tBLiveInteractiveManager != null) {
                if (this.mContainer == null) {
                    this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_h5_tab_flexalocal, (ViewGroup) null);
                }
                this.mContainer.setVisibility(0);
                this.webViewLayout = this.mContainer.findViewById(R.id.taolive_goods_frame_h5_tab_webview_layout);
                View findViewById = this.mContainer.findViewById(R.id.taolive_goods_frame_h5_tab_retry_layout);
                this.retryLayout = findViewById;
                ViewProxy.setOnClickListener(findViewById, new a());
                this.retryLayout.setVisibility(8);
                VideoInfo c0 = up6.c0(this.mFrameContext);
                HashMap hashMap = new HashMap();
                if (c0 == null) {
                    str2 = "-1";
                } else {
                    str2 = c0.liveId;
                }
                hashMap.put("liveId", str2);
                IInteractiveProxy.d s = tBLiveInteractiveManager.s((ViewGroup) this.webViewLayout);
                if (s instanceof qoa) {
                    qoa qoaVar = (qoa) s;
                    this.h5Container = qoaVar;
                    ukr ukrVar = (ukr) tBLiveInteractiveManager;
                    qoaVar.s(ukrVar.X());
                    this.h5Container.r(ukrVar.W());
                    this.h5Container.n(new b(hashMap));
                    this.h5Container.o(this.resultUrl);
                }
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        qoa qoaVar = this.h5Container;
        if (qoaVar != null) {
            qoaVar.d();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        qoa qoaVar = this.h5Container;
        if (qoaVar != null) {
            qoaVar.j();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        qoa qoaVar = this.h5Container;
        if (qoaVar != null) {
            qoaVar.m();
        }
    }

    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        qoa qoaVar = this.h5Container;
        if (qoaVar != null) {
            qoaVar.u();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
        } else {
            super.onStatusChange(i, obj);
        }
    }

    public H5TabFrame(Context context, boolean z) {
        super(context, z);
    }

    public H5TabFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public H5TabFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public H5TabFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }
}
