package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.Animation;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.login4android.api.Login;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractAddCartView;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractCouponView;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wh2 extends uh2 implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "BootImageInteractController";

    static {
        t2o.a(573571103);
    }

    public wh2() {
    }

    private BootImageInteractBaseView g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("f275da64", new Object[]{this});
        }
        if (this.f29368a == null) {
            tm1.a(e, "createCartView");
            this.f29368a = new BootImageInteractAddCartView(this.d, this.b);
        }
        return this.f29368a;
    }

    private BootImageInteractBaseView h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("b4a57e6a", new Object[]{this});
        }
        if (this.f29368a == null) {
            tm1.a(e, "createCouponView");
            this.f29368a = new BootImageInteractCouponView(this.d, this.b);
        }
        return this.f29368a;
    }

    private BootImageInteractBaseView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("393726b8", new Object[]{this});
        }
        if (this.f29368a == null) {
            tm1.a(e, "createDXView");
            this.f29368a = new BootImageInteractDXView(this.d, this.b, this.c);
        }
        return this.f29368a;
    }

    public static /* synthetic */ Object ipc$super(wh2 wh2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/controller/interact/BootImageInteractController");
    }

    private boolean j() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b77a95c", new Object[]{this})).booleanValue();
        }
        try {
            jSONObject = this.c.getJSONObject("bizData");
        } catch (Throwable th) {
            tm1.b(e, "isUseDX error ", th);
        }
        if (!(jSONObject == null || jSONObject.size() == 0 || !jSONObject.containsKey("dxTemplateName"))) {
            String string = jSONObject.getString("dxTemplateName");
            tm1.a(e, "isUseDX is true, dxTemplateName = " + string);
            if (!TextUtils.isEmpty(string)) {
                return true;
            }
            return false;
        }
        tm1.a(e, "isUseDX is false");
        return false;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe7b20b", new Object[]{this});
            return;
        }
        try {
            if (this.f29368a != null && !Login.checkInit()) {
                tm1.a(e, "preInitLoginSDK preInit");
                Login.preInit();
            }
        } catch (Throwable th) {
            tm1.b(e, "show preInitLoginSDK error ", th);
        }
    }

    @Override // tb.uh2
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        BootImageInteractBaseView bootImageInteractBaseView = this.f29368a;
        if (bootImageInteractBaseView != null) {
            bootImageInteractBaseView.close();
            this.f29368a.setVisibility(8);
        }
    }

    @Override // tb.uh2
    public BootImageInteractBaseView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("4b862bd4", new Object[]{this});
        }
        if (this.f29368a == null) {
            d();
        }
        return this.f29368a;
    }

    @Override // tb.uh2
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.b == null) {
            tm1.a(e, "bootImageInfo_null");
        } else {
            BootImageInteractBaseView bootImageInteractBaseView = this.f29368a;
            if (bootImageInteractBaseView == null) {
                tm1.a(e, "interactView_null");
            } else if (bootImageInteractBaseView.getParent() == null) {
                tm1.a(e, "containerView_no_parent");
            } else {
                try {
                    if (!Login.checkInit()) {
                        tm1.a(e, "LoginSdkNotInited");
                        return;
                    }
                } catch (Throwable th) {
                    tm1.b(e, "\"LoginSdkNotInited Error  ", th);
                }
                try {
                    boolean showWithAnim = this.f29368a.showWithAnim(this);
                    tm1.a(e, "show=" + showWithAnim);
                } catch (Throwable th2) {
                    tm1.b(e, "show showWithAnim ", th2);
                }
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            return;
        }
        tm1.a(e, "onAnimationEnd");
        BootImageInteractBaseView bootImageInteractBaseView = this.f29368a;
        if (bootImageInteractBaseView != null) {
            bootImageInteractBaseView.startInteract();
        }
        try {
            if (Login.checkInit()) {
                AppMonitor.Alarm.commitSuccess(BootImageDataMgr.CACHE_MODULE, "loginSdkInit");
            } else {
                AppMonitor.Alarm.commitFail(BootImageDataMgr.CACHE_MODULE, "loginSdkInit", "-1", "notInit");
            }
        } catch (Throwable th) {
            tm1.b(e, "show preInitLoginSDKFailed ", th);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
        } else {
            tm1.a(e, "onAnimationRepeat");
        }
    }

    public wh2(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b457c8e", new Object[]{this});
            return;
        }
        try {
            BootImageInfo bootImageInfo = this.b;
            if (bootImageInfo != null) {
                bootImageInfo.isDxTemplate = true;
            }
        } catch (Throwable th) {
            tm1.b(e, "renderDXFailhow fail ", th);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            return;
        }
        tm1.a(e, "onAnimationStart");
        BootImageInteractBaseView bootImageInteractBaseView = this.f29368a;
        if (bootImageInteractBaseView != null) {
            bootImageInteractBaseView.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce A[Catch: all -> 0x0025, TryCatch #2 {all -> 0x0025, blocks: (B:7:0x001b, B:9:0x001f, B:13:0x0028, B:15:0x0030, B:17:0x0036, B:19:0x003c, B:26:0x0072, B:29:0x008e, B:34:0x009b, B:37:0x00a5, B:43:0x00b3, B:44:0x00c7, B:45:0x00ce, B:46:0x00d4, B:48:0x00d8, B:50:0x00dc, B:51:0x00eb, B:20:0x0041, B:22:0x0065, B:24:0x006b, B:27:0x007b), top: B:54:0x001b }] */
    @Override // tb.uh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wh2.d():void");
    }
}
