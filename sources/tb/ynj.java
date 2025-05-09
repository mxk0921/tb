package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ynj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_ENABLE_TRANSITION = "extraEnableTransition";
    public static final String KEY_EXTRA_ENABLE_TRA_STYLE_DATA = "extraEnableTraStyleData";
    public static final String KEY_EXTRA_FRAME_ANIM_ND_REASON = "extraFrameAnimNdReason";
    public static final String KEY_ON_NAV_HIT_PRE_CACHE_DATA = "onNavHitPreCacheData";
    public static final String KEY_REAL_HIT_MASK_FRAME_ANIM = "realHitMaskFrameAnim";

    static {
        t2o.a(918552597);
    }

    public static void a(qx9 qx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89eaae0e", new Object[]{qx9Var});
        } else {
            qx9Var.h(true);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291ccc0c", new Object[]{str});
        } else {
            tpu.Companion.a(qz7.TAG_FAST_ANIM, str, null);
        }
    }

    public static void g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c00753", new Object[]{intent});
        } else {
            tqm.Companion.b(intent);
        }
    }

    public static void h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3436aba6", new Object[]{intent});
        } else {
            tqm.Companion.c(intent);
        }
    }

    public static void i(zmj zmjVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf16a0ec", new Object[]{zmjVar, intent});
            return;
        }
        tpu.Companion.a("TikTestDress", "TikTestDress NavProcessor: onStartNav ${navContext} intent: intent", null);
        Uri data = intent.getData();
        if (data != null) {
            String path = data.getPath();
            qx9 qx9Var = new qx9();
            a(qx9Var);
            b(intent, zmjVar, qx9Var);
            c(intent, qx9Var, data);
            d(intent, qx9Var, data);
            e(intent, zmjVar, qx9Var);
            if (TextUtils.equals(path, "/dressup/feeds/index.htm")) {
                try {
                    h(intent);
                } catch (Exception e) {
                    tpu.a aVar = tpu.Companion;
                    aVar.a("dress_up导航", "DressUp导航处理失败:onStartFeedNav:请修复:exception:" + Log.getStackTraceString(e), null);
                    if (kz7.a()) {
                        Context d = zmjVar.d();
                        Toast.makeText(d, "Debug提示:DressUp-onStartFeedNav-失败:请修复:" + e.getCause(), 1).show();
                    }
                }
            } else if (TextUtils.equals(path, "/dressup/detail/index.htm")) {
                try {
                    g(intent);
                } catch (Exception e2) {
                    tpu.a aVar2 = tpu.Companion;
                    aVar2.a("dress_up导航", "DressUp导航处理失败:onStartDetailNav:请修复:exception:" + Log.getStackTraceString(e2), null);
                    if (kz7.a()) {
                        Context d2 = zmjVar.d();
                        Toast.makeText(d2, "Debug提示:DressUp-onStartDetailNav-失败:请修复:" + e2.getCause(), 1).show();
                    }
                }
            }
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3c0d8c", new Object[0])).booleanValue();
        }
        return az7.b();
    }

    public static void b(Intent intent, zmj zmjVar, qx9 qx9Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188ea7c0", new Object[]{intent, zmjVar, qx9Var});
        } else if (intent != null) {
            if (!j()) {
                qx9Var.e("orangeClose");
                f("无极缩放-降级。二跳Orange关闭");
            } else if (!Boolean.TRUE.equals(Boolean.valueOf(intent.getBooleanExtra("extraEnableTransition", false)))) {
                f("一跳未传递无极缩放标识。");
                qx9Var.e("noAnimFlag");
            } else if (NewDetailMaskFrameLayout.checkHasMaskFrameAnimParams(zmjVar.a())) {
                qx9Var.f(true);
                qx9Var.e("animSuccess-WithFlag");
            } else {
                f("一跳虽然传递了无极缩放标识，但是未传递坐标参数。");
                StringBuilder sb = new StringBuilder("noAnimExtra:null-");
                if (zmjVar.a() != null) {
                    z = false;
                }
                sb.append(z);
                qx9Var.e(sb.toString());
            }
        }
    }

    public static void c(Intent intent, qx9 qx9Var, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62547fb", new Object[]{intent, qx9Var, uri});
        } else if (!qx9Var.b()) {
            f("不支持无极缩放。skip CheckSupportAnimForNoData。");
        } else if (!qx9Var.c() && intent != null) {
            if (uri == null) {
                uri = intent.getData();
            }
            if (uri != null && "true".equals(uri.getQueryParameter("enableNoDataTransition"))) {
                qx9Var.g(true);
                f("EnableTraNoData:一跳在Url中传递了要求没有瞬开数据时也执行无极缩放的实验标，本次跳转将强制命中无极缩放。");
            } else if (Boolean.TRUE.equals(Boolean.valueOf(intent.getBooleanExtra("extraEnableTraNoData", false)))) {
                qx9Var.g(true);
                f("EnableTraNoData:一跳传递了没有瞬开数据时也执行无极缩放的实验标，本次跳转将强制命中无极缩放。");
            }
        }
    }

    public static void d(Intent intent, qx9 qx9Var, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84379ab7", new Object[]{intent, qx9Var, uri});
        } else if (qx9Var.j()) {
            f("无瞬开，无极缩放样式检查开始。");
            if (intent != null) {
                String queryParameter = uri == null ? null : uri.getQueryParameter("styleForNoDataTran");
                if (queryParameter != null && queryParameter.contains("baseTran")) {
                    qx9Var.i(false);
                    f("无极缩放样式:未命中瞬开数据，保留 ScaleImageView。");
                } else if (queryParameter == null || !queryParameter.contains("skipScale")) {
                    qx9Var.i(true);
                    f("无极缩放样式:默认值。");
                } else {
                    qx9Var.i(true);
                    f("无极缩放样式:未命中瞬开数据，强制关闭 ScaleImageView。");
                }
            }
        } else {
            f("不检查无极缩放样式。");
        }
    }

    public static void e(Intent intent, zmj zmjVar, qx9 qx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5acd45", new Object[]{intent, zmjVar, qx9Var});
        } else if (qx9Var.d()) {
            zmjVar.d();
            intent.putExtra("realHitMaskFrameAnim", true);
            intent.putExtra("onNavHitPreCacheData", qx9Var.c());
            int B0 = byj.B0();
            intent.putExtra("extraEnableTraStyleData", qx9Var.k());
            NewDetailMaskFrameLayout.setAdapterSpeedAndStartCheckStatus(B0, intent);
            intent.putExtra("extraFrameAnimNdReason", qx9Var.a());
            bx0.h(intent, zmjVar);
            f("无极缩放参数检查已成功。转场控制已生效。");
        } else if (zmjVar.k()) {
            zmjVar.s(false);
            f("无极缩放参数检查已失败。转场控制已回退。");
        }
    }
}
