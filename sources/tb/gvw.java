package tb;

import android.content.Context;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.utils.ILog;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gvw implements z7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static gvw e;

    /* renamed from: a  reason: collision with root package name */
    public final IWXAPI f20261a;
    public a8d b;
    public PayRequest c;
    public final wxl d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ILog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(gvw gvwVar) {
        }

        @Override // com.tencent.mm.opensdk.utils.ILog
        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
                return;
            }
            hav.d("WxPay", "wxapi log: " + str + str2);
        }

        @Override // com.tencent.mm.opensdk.utils.ILog
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
                return;
            }
            hav.d("WxPay", "wxapi log: " + str + str2);
        }

        @Override // com.tencent.mm.opensdk.utils.ILog
        public void i(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
                return;
            }
            hav.d("WxPay", "wxapi log: " + str + str2);
        }

        @Override // com.tencent.mm.opensdk.utils.ILog
        public void w(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
                return;
            }
            hav.d("WxPay", "wxapi log: " + str + str2);
        }

        @Override // com.tencent.mm.opensdk.utils.ILog
        public void v(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("625b1491", new Object[]{this, str, str2});
                return;
            }
            hav.g("wxapi log: " + str + str2, new String[0]);
        }
    }

    public gvw(Context context) {
        WeakReference weakReference = new WeakReference(context);
        String a2 = buw.a();
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, a2, true);
        this.f20261a = createWXAPI;
        createWXAPI.registerApp(a2);
        createWXAPI.setLogImpl(new a(this));
        this.d = new wxl((Context) weakReference.get(), PayRequest.CALL_WEIXIN_SDK);
    }

    public static gvw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gvw) ipChange.ipc$dispatch("8a337380", new Object[0]);
        }
        gvw gvwVar = e;
        if (gvwVar != null) {
            return gvwVar;
        }
        throw new NullPointerException("请先进行初始化");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("423ee352", new Object[0])).booleanValue();
        }
        if (e == null) {
            return true;
        }
        return false;
    }

    public static gvw l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gvw) ipChange.ipc$dispatch("103a77da", new Object[]{context});
        }
        gvw gvwVar = new gvw(context);
        e = gvwVar;
        return gvwVar;
    }

    @Override // tb.z7d
    public void a(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef63387", new Object[]{this, payRequest});
            return;
        }
        this.c = payRequest;
        payRequest.setPayMethod("wechat");
        n(payRequest);
    }

    public void c(a8d a8dVar, String str, String str2, String str3) {
        PayRequest payRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277ac1b7", new Object[]{this, a8dVar, str, str2, str3});
        } else if (a8dVar != null && (payRequest = this.c) != null) {
            PayResultInfo payResultInfo = new PayResultInfo(str, str2, str3, payRequest);
            wxl wxlVar = this.d;
            if (wxlVar != null) {
                wxlVar.r(payResultInfo.resultStatus);
            }
            a8dVar.a(this.c.getUnSuccessUrl(), payResultInfo);
        }
    }

    public void d(a8d a8dVar, String str, String str2, String str3) {
        PayRequest payRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91611e91", new Object[]{this, a8dVar, str, str2, str3});
        } else if (a8dVar != null && (payRequest = this.c) != null) {
            PayResultInfo payResultInfo = new PayResultInfo(str, str2, str3, payRequest);
            wxl wxlVar = this.d;
            if (wxlVar != null) {
                wxlVar.r(payResultInfo.resultStatus);
            }
            a8dVar.b(this.c.getUnSuccessUrl(), payResultInfo);
        }
    }

    public void e(BaseResp baseResp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34453e5", new Object[]{this, baseResp});
        } else if (baseResp.getType() == 5) {
            int i = baseResp.errCode;
            if (i == 0) {
                a8d a8dVar = this.b;
                if (a8dVar != null) {
                    f(a8dVar, "9000", String.valueOf(i), "支付成功");
                    this.b = null;
                }
            } else if (-2 == i) {
                a8d a8dVar2 = this.b;
                if (a8dVar2 != null) {
                    c(a8dVar2, "6001", String.valueOf(i), "用户取消");
                    this.b = null;
                }
            } else {
                a8d a8dVar3 = this.b;
                if (a8dVar3 != null) {
                    d(a8dVar3, "4000", String.valueOf(i), "支付失败");
                    this.b = null;
                }
            }
        } else if (19 == baseResp.getType()) {
            WXLaunchMiniProgram.Resp resp = (WXLaunchMiniProgram.Resp) baseResp;
        }
    }

    public void f(a8d a8dVar, String str, String str2, String str3) {
        PayRequest payRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9a424a", new Object[]{this, a8dVar, str, str2, str3});
        } else if (a8dVar != null && (payRequest = this.c) != null) {
            PayResultInfo payResultInfo = new PayResultInfo(str, str2, str3, payRequest);
            wxl wxlVar = this.d;
            if (wxlVar != null) {
                wxlVar.r(payResultInfo.resultStatus);
            }
            a8dVar.c(this.c.getSuccessUrl(), payResultInfo);
        }
    }

    public final void g(Map<String, String> map) {
        wxl wxlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c974af1e", new Object[]{this, map});
        } else if (map != null && (wxlVar = this.d) != null) {
            wxlVar.q(map, false);
            this.d.t();
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3da6a60f", new Object[]{this})).booleanValue();
        }
        return this.f20261a.isWXAppInstalled();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b80661c", new Object[]{this})).booleanValue();
        }
        if (this.f20261a.getWXAppSupportAPI() >= 570425345) {
            return true;
        }
        return false;
    }

    public void k(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fa2d0e", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = str;
        req.path = str2;
        req.miniprogramType = i;
        this.f20261a.sendReq(req);
    }

    public z7d m(a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7d) ipChange.ipc$dispatch("fd55855", new Object[]{this, a8dVar});
        }
        this.b = a8dVar;
        return this;
    }

    public final void n(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e77acc8", new Object[]{this, payRequest});
            return;
        }
        Map<String, String> map = null;
        if (!i()) {
            xhi.i(Localization.q(R.string.taobao_app_wx_install_tip));
            PayRequest payRequest2 = this.c;
            if (payRequest2 != null) {
                map = payRequest2.getExtAttrMap();
            }
            bf3.k(map, "wxpay_app_not_install", "未安装微信");
            hav.d("WxPay", "未安装微信");
            d(this.b, "8001", "wxpay_app_not_install", "未安装微信");
        } else if (!j()) {
            PayRequest payRequest3 = this.c;
            if (payRequest3 != null) {
                map = payRequest3.getExtAttrMap();
            }
            bf3.k(map, "wxpay_not_support", "您的微信版本不支持支付，请安装最新版");
            hav.d("WxPay", "您的微信版本不支持支付，请安装最新版");
            d(this.b, "4000", "wxpay_not_support", "您的微信版本不支持支付，请安装最新版");
        } else {
            g(payRequest.getExtAttrMap());
            String actionParams = payRequest.getActionParams();
            PayReq payReq = new PayReq();
            try {
                JSONObject parseObject = JSON.parseObject(actionParams);
                payReq.packageValue = parseObject.getString("package");
                payReq.appId = parseObject.getString("appId");
                payReq.sign = parseObject.getString("sign");
                payReq.signType = parseObject.getString("signType");
                payReq.partnerId = parseObject.getString("partnerid");
                payReq.prepayId = parseObject.getString("prepayid");
                payReq.nonceStr = parseObject.getString("nonceStr");
                payReq.timeStamp = parseObject.getString("timeStamp");
                if (!this.f20261a.sendReq(payReq)) {
                    PayRequest payRequest4 = this.c;
                    bf3.k(payRequest4 != null ? payRequest4.getExtAttrMap() : null, "wxpay_params_error", "支付参数错误");
                    hav.d("WxPay", "支付参数错误");
                    d(this.b, "4000", "wxpay_params_error", "支付参数错误");
                    this.b = null;
                }
            } catch (Exception unused) {
                PayRequest payRequest5 = this.c;
                bf3.k(payRequest5 != null ? payRequest5.getExtAttrMap() : null, "wxpay_exception", "支付异常");
                hav.d("WxPay", "支付异常");
                d(this.b, "4000", "wxpay_exception", "支付异常");
                this.b = null;
            }
        }
    }
}
