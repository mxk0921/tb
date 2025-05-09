package tb;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.norm.IFaceAdapter;
import com.alibaba.poplayer.norm.IPopLayerViewFactoryAdapter;
import com.alibaba.poplayer.norm.IUserCheckRequestListener;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tbpoplayer.filter.MtopGroupPreCheckManager;
import com.taobao.tbpoplayer.filter.MtopPopCheckHelper;
import com.taobao.tbpoplayer.view.PopLayerWebView;
import com.taobao.tbpoplayer.view.PopLayerWeex2View;
import com.taobao.tbpoplayer.view.PopLayerWeexView;
import com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView;
import com.taobao.tbpoplayer.watermask.PopWaterMaskView;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class dcr implements IFaceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Nav.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(790626345);
            t2o.a(578814039);
        }

        public b() {
        }
    }

    static {
        t2o.a(790626343);
        t2o.a(625999971);
    }

    public static /* synthetic */ void c(MtopFinishEvent mtopFinishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf87878", new Object[]{mtopFinishEvent, obj});
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public boolean cancelPopCheckRequest(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b36eb455", new Object[]{this, popRequest})).booleanValue();
        }
        return MtopPopCheckHelper.m().e(popRequest);
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getCurAppVersion(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff6eda00", new Object[]{this, context});
        }
        return Globals.getVersionName();
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public long getCurrentTimeStamp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4c56b02", new Object[]{this, context})).longValue();
        }
        return TimeStampManager.instance().getCurrentTimeStamp();
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return UTDevice.getUtdid(PopLayer.getReference().getApp());
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getUTCurPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cee17b4", new Object[]{this});
        }
        return c2v.getInstance().getCurrentPageName();
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return Login.getUserId();
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    @Deprecated
    public void navToUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1fe2fa", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public void preparePopCheckRequest(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27c8f64", new Object[]{this, popRequest});
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public void registerNavPreprocessor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19274692", new Object[]{this, context});
        } else {
            Nav.registerHooker(new b());
        }
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public void registerTrackViewTypes(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86314f55", new Object[]{this, context});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("webview");
        arrayList.add("weex");
        arrayList.add("native");
        arrayList.add("weex2");
        arrayList.add(PopWaterMaskView.VIEW_TYPE);
        PopLayer.getReference().registerViewType(new IPopLayerViewFactoryAdapter() { // from class: tb.bcr
            @Override // com.alibaba.poplayer.norm.IPopLayerViewFactoryAdapter
            public final PopLayerBaseView generatePopLayerViewByType(Context context2, String str, a aVar) {
                PopLayerBaseView d;
                d = dcr.d(context2, str, aVar);
                return d;
            }
        }, arrayList, "webview");
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public boolean startPopCheckRequest(PopRequest popRequest, IUserCheckRequestListener iUserCheckRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98940bb2", new Object[]{this, popRequest, iUserCheckRequestListener})).booleanValue();
        }
        if (iUserCheckRequestListener == null) {
            if (popRequest != null) {
                popRequest.k().E = "skip";
            }
            wdm.f("pageLifeCycle", com.alibaba.poplayer.trigger.a.R(popRequest), "requestListener=null");
            return false;
        }
        JSONObject l = MtopPopCheckHelper.m().l(popRequest);
        if (l == null) {
            return false;
        }
        if (!MtopGroupPreCheckManager.i().j(popRequest) || !a9l.w().G()) {
            return MtopPopCheckHelper.m().u(popRequest, l, iUserCheckRequestListener);
        }
        return MtopGroupPreCheckManager.i().o(popRequest, l, iUserCheckRequestListener);
    }

    @Override // com.alibaba.poplayer.norm.IFaceAdapter
    public boolean doneConstraintMockRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff2eab1", new Object[]{this})).booleanValue();
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.taobao.aplatform.weakGet");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(false);
            HashMap hashMap = new HashMap();
            hashMap.put("bizType", "poplayer_support.mockFinishSet");
            JSONObject parseObject = JSON.parseObject(PopLayerMockManager.instance().getMockParamData());
            Set<String> mockCheckedIndexIDs = PopLayerMockManager.instance().getMockCheckedIndexIDs();
            HashSet hashSet = new HashSet();
            if (mockCheckedIndexIDs != null) {
                hashSet.addAll(mockCheckedIndexIDs);
            }
            parseObject.put("indexIdList", (Object) hashSet);
            hashMap.put("bizParam", parseObject.toJSONString());
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
            Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()).build(mtopRequest, TaoPackageInfo.getTTID()).addListener(new MtopCallback.MtopFinishListener() { // from class: tb.ccr
                @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
                public final void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
                    dcr.c(mtopFinishEvent, obj);
                }
            }).reqMethod(MethodEnum.POST).asyncRequest();
        } catch (Throwable th) {
            wdm.h("startPopCheckRequest.sendUserCheckRequest.error", th);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ PopLayerBaseView d(Context context, String str, com.alibaba.poplayer.trigger.a aVar) {
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerBaseView) ipChange.ipc$dispatch("8152e98e", new Object[]{context, str, aVar});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Context mutableContextWrapper = a9l.w().A() ? new MutableContextWrapper(context) : context;
            switch (str.hashCode()) {
                case -1052618729:
                    if (str.equals("native")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -214377309:
                    if (str.equals(PopWaterMaskView.VIEW_TYPE)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3645441:
                    if (str.equals("weex")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 113008721:
                    if (str.equals("weex2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1224424441:
                    if (str.equals("webview")) {
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                aVar.k().k0 = "webview";
                return new PopLayerWebView(mutableContextWrapper);
            } else if (c == 1) {
                aVar.k().k0 = "native";
                return new PopLayerNativeView(mutableContextWrapper);
            } else if (c == 2) {
                aVar.k().k0 = "weex";
                return new PopLayerWeexView(mutableContextWrapper);
            } else if (c == 3) {
                aVar.k().k0 = "weex2";
                return new PopLayerWeex2View(mutableContextWrapper);
            } else if (c != 4) {
                aVar.k().k0 = str;
                return icm.a(context, str);
            } else {
                aVar.k().k0 = PopWaterMaskView.VIEW_TYPE;
                return new PopWaterMaskView(mutableContextWrapper);
            }
        } catch (Throwable th) {
            wdm.h("IPopLayerViewAdapter.generatePopLayerViewByType.error.", th);
            return null;
        }
    }
}
