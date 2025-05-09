package com.alipay.module.face.helper;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioDetectorBuilder;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FaceRpcRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String o = "FaceRpcRunnable";
    private static String p = "aliveImgUrl";

    /* renamed from: a  reason: collision with root package name */
    public ZIMFacade f4497a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Bundle f;
    private BioResponse g;
    private ZIMResponse h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private MicroModule n;

    public FaceRpcRunnable(ZIMResponse zIMResponse, String str, String str2, String str3, String str4, Bundle bundle, boolean z, MicroModule microModule) {
        Map map;
        this.i = false;
        this.j = true;
        this.k = true;
        this.l = false;
        this.m = false;
        this.h = zIMResponse;
        if (!(zIMResponse == null || (map = zIMResponse.extInfo) == null || !"993".equalsIgnoreCase((String) map.get("ui")))) {
            VerifyLogCat.i(o, "本次为【加菲】人脸回调");
            this.m = true;
        }
        d(str, str2, str3, str4, bundle, z, microModule);
    }

    public static /* synthetic */ void a(FaceRpcRunnable faceRpcRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c423af", new Object[]{faceRpcRunnable});
        } else {
            faceRpcRunnable.a();
        }
    }

    private void c(final MICRpcResponse mICRpcResponse, final ModuleExecuteResult moduleExecuteResult) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105a29e8", new Object[]{this, mICRpcResponse, moduleExecuteResult});
        } else if (!this.k || ModuleConstants.VI_MODULE_LOGIN_FACE.equalsIgnoreCase(this.d)) {
            VerifyLogCat.i(o, "no need to ALERT!");
            if (mICRpcResponse != null) {
                b(mICRpcResponse);
            } else {
                a(moduleExecuteResult);
            }
        } else {
            VerifyLogCat.i(o, "need to ALERT when the result is failed!");
            if (mICRpcResponse != null) {
                str2 = mICRpcResponse.verifyMessage;
                str = mICRpcResponse.verifyCode;
            } else if (this.n.getTask().getPluginOrProxyMode()) {
                a(moduleExecuteResult);
                return;
            } else {
                str2 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_res_net_error);
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                if ("NOT_SAME_PERSON".equalsIgnoreCase(str)) {
                    str2 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.not_same_person);
                } else {
                    str2 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.other_face_res_error);
                }
            }
            MicroModuleContext.getInstance().alert(null, str2, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_res_error_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.module.face.helper.FaceRpcRunnable.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    MICRpcResponse mICRpcResponse2 = mICRpcResponse;
                    if (mICRpcResponse2 != null) {
                        FaceRpcRunnable.a(FaceRpcRunnable.this, mICRpcResponse2);
                    } else {
                        FaceRpcRunnable.this.a(moduleExecuteResult);
                    }
                }
            }, null, null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            String str = o;
            VerifyLogCat.i(str, "no need to show processdialog. mNeedProcessRes: " + this.j + ", mAutoClose: false");
            MICRpcRequest mICRpcRequest = new MICRpcRequest();
            mICRpcRequest.module = this.d;
            JSONObject jSONObject = new JSONObject();
            if (!this.l) {
                jSONObject.put("faceToken", (Object) this.e);
                jSONObject.put(upx.BISTOKEN, (Object) this.e);
            }
            Bundle bundle = this.f;
            if (bundle != null) {
                jSONObject.put("zimId", (Object) bundle.getString("zimId"));
                jSONObject.put("useZim", (Object) this.f.getString("useZim"));
                String string = this.f.getString("certName");
                String string2 = this.f.getString("certNo");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("certName", (Object) string);
                }
                if (!TextUtils.isEmpty(string2)) {
                    jSONObject.put("certNo", (Object) string2);
                }
            }
            Bundle bundle2 = this.f;
            if (bundle2 != null && !TextUtils.isEmpty(bundle2.getString(TBImageFlowMonitor.RESPONSE_CODE_MEASURE)) && !TextUtils.isEmpty(this.f.getString("zimAction"))) {
                jSONObject.put(TBImageFlowMonitor.RESPONSE_CODE_MEASURE, (Object) this.f.getString(TBImageFlowMonitor.RESPONSE_CODE_MEASURE));
                jSONObject.put("zimAction", (Object) this.f.getString("zimAction"));
            }
            mICRpcRequest.data = jSONObject.toString();
            mICRpcRequest.verifyId = this.b;
            mICRpcRequest.token = this.c;
            mICRpcRequest.action = "VERIFY_FACE";
            MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
            MicroModuleContext.getInstance().dismissProgressDialog();
            if (!this.j) {
                return;
            }
            if (dispatch == null || !dispatch.success) {
                c(null, new DefaultModuleResult("2003"));
            } else if (dispatch.verifySuccess) {
                b(dispatch);
            } else {
                c(dispatch, null);
            }
        } catch (RpcException e) {
            String str2 = o;
            VerifyLogCat.e(str2, "RpcException " + e.getMessage());
            MicroModuleContext.getInstance().dismissProgressDialog();
            c(null, new DefaultModuleResult("2003"));
        } catch (Exception e2) {
            VerifyLogCat.printStackTraceAndMore(e2);
            MicroModuleContext.getInstance().dismissProgressDialog();
            c(null, new DefaultModuleResult("2002"));
        }
    }

    public static /* synthetic */ void a(FaceRpcRunnable faceRpcRunnable, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2de7faf", new Object[]{faceRpcRunnable, mICRpcResponse});
        } else {
            faceRpcRunnable.b(mICRpcResponse);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MicroModuleContext.getInstance().finishModule(this.b, this.c, this.d);
        try {
            VerifyLogCat.i(o, "现在关闭人脸");
            if (this.l) {
                this.f4497a.command(4099);
                this.f4497a.destroy();
            } else {
                BioDetector create = BioDetectorBuilder.create(MicroModuleContext.getInstance().getContext(), new com.alipay.mobile.security.bio.module.MicroModule());
                create.command(4099);
                create.destroy();
            }
        } catch (Throwable th) {
            VerifyLogCat.e(o, "关闭人脸时出错！", th);
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-170206-1", Constants.VI_ENGINE_APPID, "notifyBisSDKExit", this.c, this.b, null, null);
    }

    private void b(MICRpcResponse mICRpcResponse) {
        Map<? extends String, ? extends Object> map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28c656", new Object[]{this, mICRpcResponse});
            return;
        }
        VerifyLogCat.i(o, "now we go to handleNotNullRpcRes");
        if (!mICRpcResponse.verifySuccess || !mICRpcResponse.finish) {
            z = false;
        }
        this.i = z;
        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
        moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        JSONObject parseObject = JSON.parseObject(mICRpcResponse.data);
        HashMap<String, Object> hashMap = new HashMap<>();
        if (parseObject != null) {
            hashMap.put(p, parseObject.getString(p));
        }
        BioResponse bioResponse = this.g;
        if (!(bioResponse == null || bioResponse.getExt() == null)) {
            hashMap.putAll(this.g.getExt());
        }
        ZIMResponse zIMResponse = this.h;
        if (!(zIMResponse == null || (map = zIMResponse.extInfo) == null)) {
            hashMap.putAll(map);
        }
        moduleExecuteResult.setExtInfo(hashMap);
        a(moduleExecuteResult);
    }

    private void d(String str, String str2, String str3, String str4, Bundle bundle, boolean z, MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36be482", new Object[]{this, str, str2, str3, str4, bundle, new Boolean(z), microModule});
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bundle;
        this.j = z;
        this.n = microModule;
        if (bundle != null) {
            if ("N".equalsIgnoreCase(bundle.getString("popupErrMsg"))) {
                this.k = false;
            }
            if ("Y".equalsIgnoreCase(bundle.getString("useZim"))) {
                this.l = true;
            }
        }
        String str5 = o;
        VerifyLogCat.i(str5, "mNeedNoticeOnRpcError: " + this.k);
        String str6 = o;
        VerifyLogCat.i(str6, "mUseZim: " + this.l);
    }

    public FaceRpcRunnable(BioResponse bioResponse, String str, String str2, String str3, String str4, Bundle bundle, boolean z, MicroModule microModule) {
        this.i = false;
        this.j = true;
        this.k = true;
        this.l = false;
        this.m = false;
        this.g = bioResponse;
        d(str, str2, str3, str4, bundle, z, microModule);
    }

    public final void a(ModuleExecuteResult moduleExecuteResult) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515b1096", new Object[]{this, moduleExecuteResult});
            return;
        }
        if (this.l && (bundle = this.f) != null) {
            String string = bundle.getString("desensName");
            if (!TextUtils.isEmpty(string) && moduleExecuteResult != null) {
                if (moduleExecuteResult.getExtInfo() != null) {
                    moduleExecuteResult.getExtInfo().put("desensName", string);
                } else {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("desensName", string);
                    moduleExecuteResult.setExtInfo(hashMap);
                }
            }
        }
        MicroModuleContext.getInstance().notifyModuleResult(this.b, this.c, this.d, moduleExecuteResult);
        long j = this.f.getLong("face_delay_time", 0L);
        if (this.m || !this.i || 0 == j) {
            a();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.module.face.helper.FaceRpcRunnable.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FaceRpcRunnable.a(FaceRpcRunnable.this);
                    }
                }
            }, j);
        }
    }
}
