package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountValueParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgJoinMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgMsgFetchMode;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgPowerMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendMessageParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendTextParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSubscribeParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTextMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTopicRequestParams;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgUnSubscribeParams;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.OpenArchPMMessageCategory;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageResponse;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizCode;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.OpenArchPMBizTag;
import com.taobao.kmp.nexus.arch.openArch.service.powermsg.PMInstanceState;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.lic;
import tb.nzf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ1\u0010 \u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b \u0010\u001eJ3\u0010'\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0014\u0018\u00010#j\u0004\u0018\u0001`%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00142\u0006\u0010*\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102JA\u00105\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J1\u00107\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u000104H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010\u0016J\u000f\u0010:\u001a\u00020\u0014H\u0016¢\u0006\u0004\b:\u0010\u0016J\u0019\u0010=\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0014H\u0000¢\u0006\u0004\b?\u0010\u0016J\u0015\u0010A\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020@¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020$¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020$¢\u0006\u0004\bE\u0010DJ\u0015\u0010F\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020$¢\u0006\u0004\bF\u0010DJ\u0015\u0010H\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020G¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020J¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020M¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u00142\u0006\u0010\t\u001a\u000200¢\u0006\u0004\bP\u00102J\u0015\u0010R\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020T¢\u0006\u0004\bU\u0010VJ\u0015\u0010W\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020)¢\u0006\u0004\bW\u0010,J\u0015\u0010X\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\nH\u0016¢\u0006\u0004\b^\u0010_J7\u0010c\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010`\u001a\u0004\u0018\u00010\u00102\b\u0010a\u001a\u0004\u0018\u00010\u00102\b\u0010b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bc\u0010dJ\u0011\u0010e\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\be\u0010\u0012J\u0019\u0010f\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0014H\u0016¢\u0006\u0004\bh\u0010\u0016J\u000f\u0010i\u001a\u00020\u0014H\u0016¢\u0006\u0004\bi\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010\u0007R$\u0010s\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010\u0012\"\u0004\br\u0010gR$\u0010v\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010p\u001a\u0004\bt\u0010\u0012\"\u0004\bu\u0010gR\u0018\u0010y\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010xR\u0018\u0010|\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010pR\u0018\u0010~\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010pR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010p\u001a\u0005\b\u0080\u0001\u0010\u0012\"\u0005\b\u0081\u0001\u0010gR'\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010p\u001a\u0005\b\u0084\u0001\u0010\u0012\"\u0005\b\u0085\u0001\u0010gR,\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R3\u0010\u0096\u0001\u001a\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u008e\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0097\u0001"}, d2 = {"Ltb/f3g;", "Ltb/nzf;", "Ltb/lic;", "", "Ltb/o1l;", "context", "<init>", "(Ltb/o1l;)V", "Ltb/b1g;", "result", "", TLogTracker.LEVEL_DEBUG, "(Ltb/b1g;)Z", "Ltb/y0g;", "C", "(Ltb/y0g;)Z", "", "K", "()Ljava/lang/String;", "J", "Ltb/xhv;", "j0", "()V", "", "index", "pageSize", "Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;", "bizCode", "topic", "h0", "(IILcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;Ljava/lang/String;)V", "m0", "k0", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgSendMessageParams;", "params", "Lkotlin/Function1;", "Ltb/w0g;", "Lcom/taobao/kmp/kernel/serviceinterface/KSOnSended;", pg1.ATOM_EXT_block, "c", "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgSendMessageParams;Ltb/g1a;)V", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgPowerMessage;", "message", "q0", "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgPowerMessage;)V", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgSendTextParams;", "r0", "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgSendTextParams;)V", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgTextMessage;", lca.STAGE_T0, "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgTextMessage;)V", "needACK", "", "E", "(Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/OpenArchPMBizCode;ZLjava/lang/String;Ljava/util/Map;)V", "H", "(Ljava/lang/String;Ljava/util/Map;)V", "x", "w", "Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/PMInstanceState;", "next", "F0", "(Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/PMInstanceState;)V", "B", "Ltb/n0g;", "U", "(Ltb/n0g;)V", "b0", "(Ltb/w0g;)V", "Y", "T", "Ltb/z0g;", "c0", "(Ltb/z0g;)V", "Ltb/a1g;", "d0", "(Ltb/a1g;)V", "Ltb/r0g;", "V", "(Ltb/r0g;)V", "a0", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgCountMessage;", ExifInterface.LATITUDE_SOUTH, "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgCountMessage;)V", "Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgJoinMessage;", "W", "(Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgJoinMessage;)V", "X", "Z", "(Ltb/y0g;)V", "e0", "(Ltb/b1g;)V", "z0", "()Ljava/lang/Boolean;", "A0", "()Z", "from", "ext", l2o.COL_BTAG, "B0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", TLogTracker.LEVEL_INFO, "unsubscribe", "(Ljava/lang/String;)V", "y", "f", "a", "Ltb/o1l;", "L", "()Ltb/o1l;", "u0", TplMsg.VALUE_T_NATIVE_RETURN, "Ljava/lang/String;", "getUuid", "setUuid", "uuid", "M", "p", "entityIdentifier", "d", "Lcom/taobao/kmp/nexus/arch/openArch/service/powermsg/PMInstanceState;", "state", "e", "prevState", "lastSubscribeFrom", at.f, "lastSubscribeBizTag", "h", "N", "v0", "identifier", bmv.MSGTYPE_INTERVAL, "Q", "y0", "Ltb/xhc;", at.j, "Ltb/xhc;", "P", "()Ltb/xhc;", "x0", "(Ltb/xhc;)V", "pmClient", "", "Ltb/j3d;", at.k, "Ljava/util/List;", "O", "()Ljava/util/List;", "w0", "(Ljava/util/List;)V", "listeners", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class f3g implements nzf, lic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private o1l f18972a;
    private String b;
    private String c;
    private PMInstanceState d;
    private PMInstanceState e;
    private String f;
    private String g;
    private String h;
    private String i;
    private xhc j;
    private List<j3d> k;

    static {
        t2o.a(1004536648);
        t2o.a(1029701651);
        t2o.a(1004536601);
        t2o.a(1004536647);
    }

    public f3g() {
        this(null, 1, null);
    }

    private final boolean C(y0g y0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3efeb3d", new Object[]{this, y0gVar})).booleanValue();
        }
        if (y0gVar.a() == null) {
            return true;
        }
        Integer a2 = y0gVar.a();
        if (a2 != null && a2.intValue() == 1000) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C0(KSPowerMsgSubscribeParams kSPowerMsgSubscribeParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b4de5a2", new Object[]{kSPowerMsgSubscribeParams});
        }
        return "subscribeParams: bizCode:" + kSPowerMsgSubscribeParams.getBizCode() + "topic:" + kSPowerMsgSubscribeParams.getTopic() + "bizTag:" + kSPowerMsgSubscribeParams.getBizTag() + "mode:" + kSPowerMsgSubscribeParams.getMode() + "from:" + kSPowerMsgSubscribeParams.getFrom() + "ext:" + kSPowerMsgSubscribeParams.getExt();
    }

    private final boolean D(b1g b1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("624d0bb6", new Object[]{this, b1gVar})).booleanValue();
        }
        if (b1gVar.a() == null) {
            return true;
        }
        Integer a2 = b1gVar.a();
        if (a2 != null && a2.intValue() == 1000) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv D0(f3g f3gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("72f2c883", new Object[]{f3gVar, n0gVar});
        }
        ckf.g(n0gVar, "error");
        f3gVar.U(n0gVar);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv E0(f3g f3gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c858bb90", new Object[]{f3gVar, n0gVar});
        }
        ckf.g(n0gVar, "error");
        f3gVar.U(n0gVar);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv F(f3g f3gVar, w0g w0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3ba69ed6", new Object[]{f3gVar, w0gVar});
        }
        ckf.g(w0gVar, "result");
        f3gVar.T(w0gVar);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv G(f3g f3gVar, n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2e8c3bbf", new Object[]{f3gVar, n0gVar});
        }
        ckf.g(n0gVar, "error");
        f3gVar.U(n0gVar);
        return xhv.INSTANCE;
    }

    private final String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1b7a9bb", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append('@');
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv i0(f3g f3gVar, r0g r0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("51851548", new Object[]{f3gVar, r0gVar});
        }
        ckf.g(r0gVar, "result");
        f3gVar.V(r0gVar);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv l0(f3g f3gVar, z0g z0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7657cc46", new Object[]{f3gVar, z0gVar});
        }
        ckf.g(z0gVar, "result");
        f3gVar.c0(z0gVar);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv n0(f3g f3gVar, a1g a1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e319ed1b", new Object[]{f3gVar, a1gVar});
        }
        ckf.g(a1gVar, "result");
        f3gVar.d0(a1gVar);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv p0(f3g f3gVar, g1a g1aVar, w0g w0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("1d4ccb66", new Object[]{f3gVar, g1aVar, w0gVar});
        }
        ckf.g(w0gVar, "result");
        f3gVar.Y(w0gVar);
        if (g1aVar != null) {
            g1aVar.invoke(w0gVar);
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv s0(f3g f3gVar, w0g w0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3e633a30", new Object[]{f3gVar, w0gVar});
        }
        ckf.g(w0gVar, "result");
        f3gVar.b0(w0gVar);
        return xhv.INSTANCE;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6f649d", new Object[]{this});
        } else {
            this.d = this.e;
        }
    }

    public void B0(String str, String str2, String str3, String str4) {
        OpenArchPMBizCode openArchPMBizCode;
        String str5;
        OpenArchPMBizTag d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9b3f9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        PMInstanceState pMInstanceState = this.d;
        PMInstanceState pMInstanceState2 = PMInstanceState.AboutToSubscribe;
        if (pMInstanceState != pMInstanceState2 && pMInstanceState != PMInstanceState.Subscribed && str != null) {
            pus pusVar = pus.INSTANCE;
            o1l o1lVar = this.f18972a;
            String str6 = null;
            pusVar.k("PM", o1lVar != null ? o1lVar.f() : null, "开始PM订阅: topic:".concat(str));
            final KSPowerMsgSubscribeParams kSPowerMsgSubscribeParams = new KSPowerMsgSubscribeParams();
            o1l o1lVar2 = this.f18972a;
            if (o1lVar2 == null || (openArchPMBizCode = o1lVar2.c()) == null) {
                openArchPMBizCode = OpenArchPMBizCode.DefaultBizCode;
            }
            kSPowerMsgSubscribeParams.setBizCode(Integer.valueOf(openArchPMBizCode.getValue()));
            kSPowerMsgSubscribeParams.setTopic(str);
            o1l o1lVar3 = this.f18972a;
            if (o1lVar3 == null || (d = o1lVar3.d()) == null || (str5 = d.getValue()) == null) {
                str5 = "tb";
            }
            kSPowerMsgSubscribeParams.setBizTag(str5);
            kSPowerMsgSubscribeParams.setMode(KSPowerMsgMsgFetchMode.PUSH_AND_PULL);
            kSPowerMsgSubscribeParams.setFrom(str2);
            kSPowerMsgSubscribeParams.setExt(str3);
            this.f = kSPowerMsgSubscribeParams.getFrom();
            this.g = kSPowerMsgSubscribeParams.getBizTag();
            o1l o1lVar4 = this.f18972a;
            if (o1lVar4 != null) {
                str6 = o1lVar4.f();
            }
            pusVar.i("PM", str6, new d1a() { // from class: tb.c3g
                @Override // tb.d1a
                public final Object invoke() {
                    String C0;
                    C0 = f3g.C0(KSPowerMsgSubscribeParams.this);
                    return C0;
                }
            });
            xhc xhcVar = this.j;
            if (xhcVar != null) {
                q0g q0gVar = new q0g();
                q0gVar.b(new g1a() { // from class: tb.d3g
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv D0;
                        D0 = f3g.D0(f3g.this, (n0g) obj);
                        return D0;
                    }
                });
                xhv xhvVar = xhv.INSTANCE;
                xhcVar.r(kSPowerMsgSubscribeParams, q0gVar);
            }
            F0(pMInstanceState2);
        }
    }

    public void E(OpenArchPMBizCode openArchPMBizCode, boolean z, String str, Map<String, ? extends Object> map) {
        xhc xhcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfa6ddb", new Object[]{this, openArchPMBizCode, new Boolean(z), str, map});
            return;
        }
        ckf.g(openArchPMBizCode, "bizCode");
        if (str != null && (xhcVar = this.j) != null) {
            KSPowerMsgCountValueParams kSPowerMsgCountValueParams = new KSPowerMsgCountValueParams();
            kSPowerMsgCountValueParams.setBizCode(Integer.valueOf(openArchPMBizCode.getValue()));
            kSPowerMsgCountValueParams.setTopic(str);
            kSPowerMsgCountValueParams.setNeedACK(Boolean.valueOf(z));
            kSPowerMsgCountValueParams.setParams(map);
            p0g p0gVar = new p0g();
            p0gVar.d(new g1a() { // from class: tb.a3g
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv F;
                    F = f3g.F(f3g.this, (w0g) obj);
                    return F;
                }
            });
            p0gVar.b(new g1a() { // from class: tb.b3g
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv G;
                    G = f3g.G(f3g.this, (n0g) obj);
                    return G;
                }
            });
            xhv xhvVar = xhv.INSTANCE;
            xhcVar.x(kSPowerMsgCountValueParams, p0gVar);
        }
    }

    public final void F0(PMInstanceState pMInstanceState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f931784f", new Object[]{this, pMInstanceState});
            return;
        }
        this.e = this.d;
        this.d = pMInstanceState;
    }

    public void H(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8fd2e9", new Object[]{this, str, map});
        } else {
            E(OpenArchPMBizCode.DefaultBizCode, true, str, map);
        }
    }

    public final String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("547c45c0", new Object[]{this});
        }
        String str = this.i;
        if (str != null) {
            return str;
        }
        o1l o1lVar = this.f18972a;
        if (o1lVar != null) {
            return o1lVar.f();
        }
        return null;
    }

    public String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c75cfd6", new Object[]{this});
        }
        String M = M();
        if (M == null) {
            return e5v.a();
        }
        return M;
    }

    public final o1l L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o1l) ipChange.ipc$dispatch("f85dafa1", new Object[]{this});
        }
        return this.f18972a;
    }

    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.c;
    }

    public final String N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("461203b7", new Object[]{this});
        }
        return this.h;
    }

    public final List<j3d> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b71e174", new Object[]{this});
        }
        return this.k;
    }

    public final xhc P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhc) ipChange.ipc$dispatch("12f3d624", new Object[]{this});
        }
        return this.j;
    }

    public final String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b2369d", new Object[]{this});
        }
        return this.i;
    }

    public nzf R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzf) ipChange.ipc$dispatch("f9044030", new Object[]{this});
        }
        return nzf.a.a(this);
    }

    public final void S(KSPowerMsgCountMessage kSPowerMsgCountMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebdda9b", new Object[]{this, kSPowerMsgCountMessage});
            return;
        }
        ckf.g(kSPowerMsgCountMessage, "result");
        PMMessageResponse h = PMMessageResponse.Companion.h(kSPowerMsgCountMessage);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.h(h);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void T(w0g w0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2825e3", new Object[]{this, w0gVar});
            return;
        }
        ckf.g(w0gVar, "result");
        PMMessageResponse k = PMMessageResponse.Companion.k(w0gVar);
        k.setMessageCategory(OpenArchPMMessageCategory.onCount);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.l(k);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void U(n0g n0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f067a9fb", new Object[]{this, n0gVar});
            return;
        }
        ckf.g(n0gVar, "result");
        PMMessageResponse g = PMMessageResponse.Companion.g(n0gVar);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.b(g);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void V(r0g r0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd125ab", new Object[]{this, r0gVar});
            return;
        }
        ckf.g(r0gVar, "result");
        List<KSPowerMsgPowerMessage> a2 = r0gVar.a();
        if (a2 != null) {
            for (KSPowerMsgPowerMessage kSPowerMsgPowerMessage : a2) {
                X(kSPowerMsgPowerMessage);
            }
        }
        List<KSPowerMsgJoinMessage> c = r0gVar.c();
        if (c != null) {
            for (KSPowerMsgJoinMessage kSPowerMsgJoinMessage : c) {
                W(kSPowerMsgJoinMessage);
            }
        }
        List<KSPowerMsgCountMessage> b = r0gVar.b();
        if (b != null) {
            for (KSPowerMsgCountMessage kSPowerMsgCountMessage : b) {
                S(kSPowerMsgCountMessage);
            }
        }
        List<KSPowerMsgTextMessage> d = r0gVar.d();
        if (d != null) {
            for (KSPowerMsgTextMessage kSPowerMsgTextMessage : d) {
                a0(kSPowerMsgTextMessage);
            }
        }
    }

    public final void W(KSPowerMsgJoinMessage kSPowerMsgJoinMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2336cd39", new Object[]{this, kSPowerMsgJoinMessage});
            return;
        }
        ckf.g(kSPowerMsgJoinMessage, "result");
        PMMessageResponse i = PMMessageResponse.Companion.i(kSPowerMsgJoinMessage);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.f(i);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void Y(w0g w0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c1de7e", new Object[]{this, w0gVar});
            return;
        }
        ckf.g(w0gVar, "result");
        PMMessageResponse k = PMMessageResponse.Companion.k(w0gVar);
        k.setMessageCategory(OpenArchPMMessageCategory.onSend);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.d(k);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void Z(y0g y0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee8ad19", new Object[]{this, y0gVar});
            return;
        }
        ckf.g(y0gVar, "result");
        if (C(y0gVar)) {
            this.i = y0gVar.c();
            F0(PMInstanceState.Subscribed);
            PMMessageResponse l = PMMessageResponse.Companion.l(y0gVar);
            List<j3d> list = this.k;
            if (list != null) {
                for (j3d j3dVar : list) {
                    j3dVar.c(l);
                }
                return;
            }
            return;
        }
        pus pusVar = pus.INSTANCE;
        o1l o1lVar = this.f18972a;
        String str = null;
        String f = o1lVar != null ? o1lVar.f() : null;
        StringBuilder sb = new StringBuilder("订阅失败: context:");
        o1l o1lVar2 = this.f18972a;
        if (o1lVar2 != null) {
            str = o1lVar2.f();
        }
        sb.append(str);
        sb.append(" message:");
        sb.append(y0gVar.b());
        sb.append(" code:");
        sb.append(y0gVar.a());
        pusVar.m("PM", f, sb.toString());
        B();
        PMMessageResponse l2 = PMMessageResponse.Companion.l(y0gVar);
        List<j3d> list2 = this.k;
        if (list2 != null) {
            for (j3d j3dVar2 : list2) {
                j3dVar2.b(l2);
            }
        }
    }

    public final void a0(KSPowerMsgTextMessage kSPowerMsgTextMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e7b77f", new Object[]{this, kSPowerMsgTextMessage});
            return;
        }
        ckf.g(kSPowerMsgTextMessage, "result");
        PMMessageResponse m = PMMessageResponse.Companion.m(kSPowerMsgTextMessage);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.e(m);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void b0(w0g w0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5923e411", new Object[]{this, w0gVar});
            return;
        }
        ckf.g(w0gVar, "result");
        PMMessageResponse k = PMMessageResponse.Companion.k(w0gVar);
        k.setMessageCategory(OpenArchPMMessageCategory.onTextSend);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.j(k);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    @Override // tb.lic
    public void c(KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, final g1a<? super w0g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587df627", new Object[]{this, kSPowerMsgSendMessageParams, g1aVar});
            return;
        }
        ckf.g(kSPowerMsgSendMessageParams, "params");
        xhc xhcVar = this.j;
        if (xhcVar != null) {
            v0g v0gVar = new v0g();
            v0gVar.d(new g1a() { // from class: tb.z2g
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv p0;
                    p0 = f3g.p0(f3g.this, g1aVar, (w0g) obj);
                    return p0;
                }
            });
            xhv xhvVar = xhv.INSTANCE;
            xhcVar.E(kSPowerMsgSendMessageParams, v0gVar);
        }
    }

    public final void c0(z0g z0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8262d64b", new Object[]{this, z0gVar});
            return;
        }
        ckf.g(z0gVar, "result");
        PMMessageResponse n = PMMessageResponse.Companion.n(z0gVar);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.k(n);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void d0(a1g a1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6f521b", new Object[]{this, a1gVar});
            return;
        }
        ckf.g(a1gVar, "result");
        PMMessageResponse o = PMMessageResponse.Companion.o(a1gVar);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.k(o);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public final void e0(b1g b1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab0304b", new Object[]{this, b1gVar});
            return;
        }
        ckf.g(b1gVar, "result");
        if (D(b1gVar)) {
            F0(PMInstanceState.Unsubscribed);
            PMMessageResponse p = PMMessageResponse.Companion.p(b1gVar);
            List<j3d> list = this.k;
            if (list != null) {
                for (j3d j3dVar : list) {
                    j3dVar.i(p);
                }
                return;
            }
            return;
        }
        pus pusVar = pus.INSTANCE;
        o1l o1lVar = this.f18972a;
        String str = null;
        String f = o1lVar != null ? o1lVar.f() : null;
        StringBuilder sb = new StringBuilder("解订阅失败: context:");
        o1l o1lVar2 = this.f18972a;
        if (o1lVar2 != null) {
            str = o1lVar2.f();
        }
        sb.append(str);
        sb.append(" message:");
        sb.append(b1gVar.b());
        sb.append(" code:");
        sb.append(b1gVar.a());
        pusVar.m("PM", f, sb.toString());
        B();
        PMMessageResponse p2 = PMMessageResponse.Companion.p(b1gVar);
        List<j3d> list2 = this.k;
        if (list2 != null) {
            for (j3d j3dVar2 : list2) {
                j3dVar2.b(p2);
            }
        }
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
        } else {
            A0();
        }
    }

    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            nzf.a.b(this);
        }
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.b;
    }

    public void h0(int i, int i2, OpenArchPMBizCode openArchPMBizCode, String str) {
        xhc xhcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67767184", new Object[]{this, new Integer(i), new Integer(i2), openArchPMBizCode, str});
            return;
        }
        ckf.g(openArchPMBizCode, "bizCode");
        if (str != null && (xhcVar = this.j) != null) {
            KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams = new KSPowerMsgTopicRequestParams();
            kSPowerMsgTopicRequestParams.setBizCode(Integer.valueOf(openArchPMBizCode.getValue()));
            kSPowerMsgTopicRequestParams.setTopic(str);
            kSPowerMsgTopicRequestParams.setIndex(Integer.valueOf(i));
            kSPowerMsgTopicRequestParams.setPageSize(Integer.valueOf(i2));
            s0g s0gVar = new s0g();
            s0gVar.d(new g1a() { // from class: tb.e3g
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv i0;
                    i0 = f3g.i0(f3g.this, (r0g) obj);
                    return i0;
                }
            });
            xhv xhvVar = xhv.INSTANCE;
            xhcVar.p(kSPowerMsgTopicRequestParams, s0gVar);
        }
    }

    public void j0() {
        OpenArchPMBizCode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba8956c", new Object[]{this});
            return;
        }
        o1l o1lVar = this.f18972a;
        if (o1lVar != null && (c = o1lVar.c()) != null) {
            h0(0, 20, c, I());
        }
    }

    public void k0(int i, int i2, OpenArchPMBizCode openArchPMBizCode, String str) {
        xhc xhcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6772a50e", new Object[]{this, new Integer(i), new Integer(i2), openArchPMBizCode, str});
            return;
        }
        ckf.g(openArchPMBizCode, "bizCode");
        if (str != null && (xhcVar = this.j) != null) {
            KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams = new KSPowerMsgTopicRequestParams();
            kSPowerMsgTopicRequestParams.setBizCode(Integer.valueOf(openArchPMBizCode.getValue()));
            kSPowerMsgTopicRequestParams.setTopic(str);
            kSPowerMsgTopicRequestParams.setIndex(Integer.valueOf(i));
            kSPowerMsgTopicRequestParams.setPageSize(Integer.valueOf(i2));
            t0g t0gVar = new t0g();
            t0gVar.d(new g1a() { // from class: tb.x2g
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv l0;
                    l0 = f3g.l0(f3g.this, (z0g) obj);
                    return l0;
                }
            });
            xhv xhvVar = xhv.INSTANCE;
            xhcVar.H(kSPowerMsgTopicRequestParams, t0gVar);
        }
    }

    public void m0(int i, int i2, OpenArchPMBizCode openArchPMBizCode, String str) {
        xhc xhcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f6b438", new Object[]{this, new Integer(i), new Integer(i2), openArchPMBizCode, str});
            return;
        }
        ckf.g(openArchPMBizCode, "bizCode");
        if (str != null && (xhcVar = this.j) != null) {
            KSPowerMsgTopicRequestParams kSPowerMsgTopicRequestParams = new KSPowerMsgTopicRequestParams();
            kSPowerMsgTopicRequestParams.setBizCode(Integer.valueOf(openArchPMBizCode.getValue()));
            kSPowerMsgTopicRequestParams.setTopic(str);
            kSPowerMsgTopicRequestParams.setIndex(Integer.valueOf(i));
            kSPowerMsgTopicRequestParams.setPageSize(Integer.valueOf(i2));
            u0g u0gVar = new u0g();
            u0gVar.d(new g1a() { // from class: tb.y2g
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv n0;
                    n0 = f3g.n0(f3g.this, (a1g) obj);
                    return n0;
                }
            });
            xhv xhvVar = xhv.INSTANCE;
            xhcVar.j(kSPowerMsgTopicRequestParams, u0gVar);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void r0(KSPowerMsgSendTextParams kSPowerMsgSendTextParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c3f5b9", new Object[]{this, kSPowerMsgSendTextParams});
            return;
        }
        ckf.g(kSPowerMsgSendTextParams, "params");
        xhc xhcVar = this.j;
        if (xhcVar != null) {
            x0g x0gVar = new x0g();
            x0gVar.d(new g1a() { // from class: tb.w2g
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv s0;
                    s0 = f3g.s0(f3g.this, (w0g) obj);
                    return s0;
                }
            });
            xhv xhvVar = xhv.INSTANCE;
            xhcVar.C(kSPowerMsgSendTextParams, x0gVar);
        }
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void t0(KSPowerMsgTextMessage kSPowerMsgTextMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c21c4b", new Object[]{this, kSPowerMsgTextMessage});
            return;
        }
        ckf.g(kSPowerMsgTextMessage, "message");
        KSPowerMsgSendTextParams kSPowerMsgSendTextParams = new KSPowerMsgSendTextParams();
        kSPowerMsgSendTextParams.setBizCode(Integer.valueOf(OpenArchPMBizCode.DefaultBizCode.getValue()));
        kSPowerMsgSendTextParams.setMessage(kSPowerMsgTextMessage);
        r0(kSPowerMsgSendTextParams);
    }

    public final void u0(o1l o1lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615846d7", new Object[]{this, o1lVar});
        } else {
            this.f18972a = o1lVar;
        }
    }

    @Override // tb.kic
    public void unsubscribe(String str) {
        PMInstanceState pMInstanceState;
        OpenArchPMBizCode openArchPMBizCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844202a2", new Object[]{this, str});
            return;
        }
        PMInstanceState pMInstanceState2 = this.d;
        if (pMInstanceState2 != PMInstanceState.Unsubscribed && pMInstanceState2 != (pMInstanceState = PMInstanceState.AboutToUnsubscribe)) {
            String I = I();
            if (I == null) {
                if (str != null) {
                    I = str;
                } else {
                    return;
                }
            }
            pus pusVar = pus.INSTANCE;
            o1l o1lVar = this.f18972a;
            String f = o1lVar != null ? o1lVar.f() : null;
            pusVar.k("PM", f, "开始PM解订阅: topic:" + str);
            F0(pMInstanceState);
            xhc xhcVar = this.j;
            if (xhcVar != null) {
                KSPowerMsgUnSubscribeParams kSPowerMsgUnSubscribeParams = new KSPowerMsgUnSubscribeParams();
                o1l o1lVar2 = this.f18972a;
                if (o1lVar2 == null || (openArchPMBizCode = o1lVar2.c()) == null) {
                    openArchPMBizCode = OpenArchPMBizCode.DefaultBizCode;
                }
                kSPowerMsgUnSubscribeParams.setBizCode(Integer.valueOf(openArchPMBizCode.getValue()));
                kSPowerMsgUnSubscribeParams.setTopic(I);
                kSPowerMsgUnSubscribeParams.setFrom(this.f);
                kSPowerMsgUnSubscribeParams.setBizTag(this.g);
                q0g q0gVar = new q0g();
                q0gVar.b(new g1a() { // from class: tb.v2g
                    @Override // tb.g1a
                    public final Object invoke(Object obj) {
                        xhv E0;
                        E0 = f3g.E0(f3g.this, (n0g) obj);
                        return E0;
                    }
                });
                xhv xhvVar = xhv.INSTANCE;
                xhcVar.l(kSPowerMsgUnSubscribeParams, q0gVar);
            }
        }
    }

    public final void v0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b62359f", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public final void w0(List<j3d> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1f06d8", new Object[]{this, list});
        } else {
            this.k = list;
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public final void x0(xhc xhcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a39a5a18", new Object[]{this, xhcVar});
        } else {
            this.j = xhcVar;
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
        }
    }

    public final void y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6a17e1", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public Boolean z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4123b101", new Object[]{this});
        }
        pus pusVar = pus.INSTANCE;
        o1l o1lVar = this.f18972a;
        String str = null;
        String f = o1lVar != null ? o1lVar.f() : null;
        StringBuilder sb = new StringBuilder("开始PM实例配置初始化: context:");
        o1l o1lVar2 = this.f18972a;
        if (o1lVar2 != null) {
            str = o1lVar2.f();
        }
        sb.append(str);
        pusVar.k("PM", f, sb.toString());
        F0(PMInstanceState.SetupCompleted);
        return Boolean.TRUE;
    }

    public f3g(o1l o1lVar) {
        this.f18972a = o1lVar;
        PMInstanceState pMInstanceState = PMInstanceState.Undefined;
        this.d = pMInstanceState;
        this.e = pMInstanceState;
        this.h = K();
        o1l o1lVar2 = this.f18972a;
        this.i = o1lVar2 != null ? o1lVar2.f() : null;
        this.k = new ArrayList();
    }

    public boolean A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b466fe1", new Object[]{this})).booleanValue();
        }
        pus pusVar = pus.INSTANCE;
        o1l o1lVar = this.f18972a;
        String f = o1lVar != null ? o1lVar.f() : null;
        pusVar.k("PM", f, "开始PM实例销毁逻辑: topic:" + I());
        F0(PMInstanceState.ShutdownCompleted);
        List<j3d> list = this.k;
        if (list != null) {
            list.clear();
        }
        this.f18972a = null;
        p(null);
        return true;
    }

    public final void X(KSPowerMsgPowerMessage kSPowerMsgPowerMessage) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d1382", new Object[]{this, kSPowerMsgPowerMessage});
            return;
        }
        ckf.g(kSPowerMsgPowerMessage, "result");
        PMMessageResponse.a aVar = PMMessageResponse.Companion;
        o1l o1lVar = this.f18972a;
        if (o1lVar != null) {
            z = o1lVar.e();
        }
        PMMessageResponse j = aVar.j(kSPowerMsgPowerMessage, z);
        List<j3d> list = this.k;
        if (list != null) {
            for (j3d j3dVar : list) {
                j3dVar.g(j);
            }
            xhv xhvVar = xhv.INSTANCE;
        }
    }

    public void q0(KSPowerMsgPowerMessage kSPowerMsgPowerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cbad3f", new Object[]{this, kSPowerMsgPowerMessage});
            return;
        }
        ckf.g(kSPowerMsgPowerMessage, "message");
        KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams = new KSPowerMsgSendMessageParams();
        kSPowerMsgSendMessageParams.setBizCode(Integer.valueOf(OpenArchPMBizCode.DefaultBizCode.getValue()));
        kSPowerMsgSendMessageParams.setMessage(kSPowerMsgPowerMessage);
        lic.a.a(this, kSPowerMsgSendMessageParams, null, 2, null);
    }

    public /* synthetic */ f3g(o1l o1lVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : o1lVar);
    }
}
