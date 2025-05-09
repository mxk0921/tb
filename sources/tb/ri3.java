package tb;

import android.text.TextUtils;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.biz.launcher.InitMotuCrash;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ri3 implements aft<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<vct<String, Void>> f27399a;

    public ri3() {
        w35.a("ChannelKALauncherProvider");
        SparseArray<vct<String, Void>> sparseArray = new SparseArray<>(24);
        this.f27399a = sparseArray;
        sparseArray.put(-552533768, new xwe("InitAccsInAppConnection"));
        sparseArray.put(-1492817388, new dxe("InitAgooLifeCycle"));
        sparseArray.put(-1200677440, new qxe("InitAtlasServiceFinder"));
        sparseArray.put(-682010769, new pwe("InitAUS"));
        sparseArray.put(332503282, new qwe("InitAVFS"));
        sparseArray.put(-1224689073, new sxe("InitBasicParam"));
        sparseArray.put(1739041206, new dye("InitChannelCookieManager"));
        sparseArray.put(-307058343, new lye("InitCookieManager"));
        sparseArray.put(-1690353657, new zye("InitDesktopTaskTrigger"));
        sparseArray.put(-682006115, new kze("InitEnv"));
        sparseArray.put(1023941872, new a1f("InitLauncher"));
        sparseArray.put(716930719, new k1f("InitLinkSmart"));
        sparseArray.put(1728603161, new q1f("InitLogin"));
        sparseArray.put(2078122612, new InitMotuCrash("InitMotuCrash"));
        sparseArray.put(814491415, new e2f("InitMsgKeepAlive"));
        sparseArray.put(536437470, new r2f("InitNetwork"));
        sparseArray.put(1262070897, new t2f("InitNetworkStrategy"));
        sparseArray.put(-224354037, new y2f("InitOrangeAfterLogin"));
        sparseArray.put(-1137794976, new a3f("InitOrangeConfig"));
        sparseArray.put(-990715651, new o5f("InitSecurityManager"));
        sparseArray.put(-2031562350, new u6f("InitTaoLog"));
        sparseArray.put(-1293333879, new v6f("InitTaoLogForAccs"));
        sparseArray.put(554204675, new j7f("InitTurboBootChannel"));
        sparseArray.put(-2100209681, new y7f("InitUt"));
        w35.c();
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be1b105f", new Object[]{str})).intValue();
        }
        int length = str.length();
        if (length <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + str.charAt(i2);
        }
        return i;
    }

    /* renamed from: c */
    public vct<String, Void> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vct) ipChange.ipc$dispatch("8948aea4", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        vct<String, Void> vctVar = this.f27399a.get(str.hashCode());
        if (vctVar != null) {
            return vctVar;
        }
        jdh.a("ChannelKALauncherProvider", "task '%s' not found, fallback to customized hashCode.", str);
        return this.f27399a.get(b(str));
    }
}
