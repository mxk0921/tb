package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.gms.tasks.OnCompleteListener;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tmgcashier.googlepay.TMGGooglePayUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "albbcashier.impl.parse.stateTree.preRender")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class pgl extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String d = "";
    public boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f26082a;
        public final /* synthetic */ lo b;

        public a(String[] strArr, lo loVar) {
            this.f26082a = strArr;
            this.b = loVar;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            OrangeConfig.getInstance().unregisterListener(this.f26082a);
            if ("false".equals(map.get("isOpenGooglePay"))) {
                TLog.logd("tmgcashier", "TMGGooglePayUtils", "isOpenGooglePay false");
                return;
            }
            String str2 = map.get("google_pay_ttids");
            String b = v6s.b(this.b.f());
            if ("212200".equals(b) || "36400112278902".equals(b) || (!TextUtils.isEmpty(b) && str2.contains(b))) {
                pgl.this.x(this.b.f());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements OnCompleteListener<Boolean> {
        public b(pgl pglVar) {
        }
    }

    static {
        t2o.a(860880927);
    }

    public static /* synthetic */ Object ipc$super(pgl pglVar, String str, Object... objArr) {
        if (str.hashCode() == -1524973416) {
            super.w0((MultiTreeNode) objArr[0], (UltronProtocol) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in extention/OverSeaFrontCashierPreRender");
    }

    @Override // tb.gt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.c = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("cash4android", "preRenderIsOpen", "true"));
        try {
            String[] strArr = {"cash4android"};
            OrangeConfig.getInstance().registerListener(strArr, new a(strArr, loVar), false);
        } catch (Throwable th) {
            Log.e("OverSeaFCPR", "getIsReadyToPayRequest error:" + th.getMessage());
            d = "";
            TLog.loge("tmgcashier", "TMGGooglePayUtils", "getIsReadyToPayRequest error :" + th.getMessage());
        }
    }

    @Override // tb.gt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.gt, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.gt, tb.dcb
    public void w0(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        super.w0(multiTreeNode, ultronProtocol);
        try {
            if (!this.c) {
                ck.g().c("FrontCashierPreRender", z1x.PRE_RENDER, "isOpenBoolean false");
            } else if (multiTreeNode != null && multiTreeNode.data() != null && Objects.equals(multiTreeNode.data().key, "overseaPayType")) {
                ck.g().c("FrontCashierPreRender", z1x.PRE_RENDER, "下载zCache");
                yox.n(Arrays.asList("front-cashier"));
            }
        } catch (Exception e) {
            rbb g = ck.g();
            g.b("FrontCashierPreRender", z1x.PRE_RENDER, "error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08b16b5", new Object[]{this, context});
            return;
        }
        try {
            TMGGooglePayUtils.getIsReadyToPayRequest(context, new b(this));
        } catch (Throwable th) {
            TLog.loge("tmgcashier", "TMGGooglePayUtils1", "onComplete error :" + th.getMessage());
        }
    }
}
