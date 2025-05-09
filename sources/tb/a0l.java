package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.kmp.nexus.arch.openArch.service.message.logger.OpenArchMessageCheckResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a0l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String LOGCATEMSGCHECK = "MsgCheck";
    public static final String LOGTAG = "OpenArchMessage";
    public static final String UTARG1MSGCHECKSTAT = "OpenArchMessage_MsgCheck";
    public int b;
    public int c;
    public int d;
    public int e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15466a = true;
    public final Map<Integer, Integer> f = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536572);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(1004536573);
            int[] iArr = new int[OpenArchMessageCheckResult.values().length];
            try {
                iArr[OpenArchMessageCheckResult.MessageCheckResultTopicNotMatch.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenArchMessageCheckResult.MessageCheckResultMsgIDDuplicated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenArchMessageCheckResult.MessageCheckResultPassed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenArchMessageCheckResult.MessageCheckResultMsgDataEmpty.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(1004536571);
    }

    public a0l(String str) {
    }

    public static final CharSequence d(Map.Entry entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("9f06667b", new Object[]{entry});
        }
        ckf.g(entry, AdvanceSetting.NETWORK_TYPE);
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) entry.getKey()).intValue());
        sb.append('_');
        sb.append(((Number) entry.getValue()).intValue());
        return sb.toString();
    }

    public final <T> void e(iky<T> ikyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155e9526", new Object[]{this, ikyVar});
            return;
        }
        pus pusVar = pus.INSTANCE;
        pusVar.m("MessageCheck", null, "MsgCheck " + f(ikyVar));
    }

    public final <T> String f(iky<T> ikyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1a3eaea", new Object[]{this, ikyVar});
        }
        String topic = ikyVar.getTopic();
        String fetchMsgId = ikyVar.fetchMsgId();
        Integer fetchType = ikyVar.fetchType();
        return "topic : " + topic + " | msgId : " + fetchMsgId + " | msgType : " + fetchType;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cff6e5a", new Object[]{this});
            return;
        }
        this.f15466a = true;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        ((LinkedHashMap) this.f).clear();
    }

    public final <T> void b(OpenArchMessageCheckResult openArchMessageCheckResult, iky<T> ikyVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43cb5846", new Object[]{this, openArchMessageCheckResult, ikyVar});
            return;
        }
        ckf.g(openArchMessageCheckResult, "checkResult");
        ckf.g(ikyVar, "message");
        if (this.f15466a && !ckf.b(ikyVar.fetchMsgId(), "-1")) {
            this.d++;
            Integer fetchType = ikyVar.fetchType();
            if (fetchType != null) {
                int intValue = fetchType.intValue();
                Map<Integer, Integer> map = this.f;
                Integer valueOf = Integer.valueOf(intValue);
                Integer num = (Integer) ((LinkedHashMap) this.f).get(Integer.valueOf(intValue));
                if (num != null) {
                    i = num.intValue();
                }
                map.put(valueOf, Integer.valueOf(i + 1));
            }
            int i2 = b.$EnumSwitchMapping$0[openArchMessageCheckResult.ordinal()];
            if (i2 == 1) {
                this.c++;
            } else if (i2 == 2) {
                this.b++;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    this.e++;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (openArchMessageCheckResult != OpenArchMessageCheckResult.MessageCheckResultPassed) {
                e(ikyVar);
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ac5eae", new Object[]{this});
            return;
        }
        this.f15466a = false;
        if (a2l.INSTANCE.h()) {
            pus.INSTANCE.m("MessageCheck", null, "commitLogger");
            v2l.Companion.a().e(UTARG1MSGCHECKSTAT, kotlin.collections.a.k(jpu.a("duplicateMsgIdCounts", String.valueOf(this.b)), jpu.a("notMatchTopicsCounts", String.valueOf(this.c)), jpu.a("msgCount", String.valueOf(this.d)), jpu.a("emptyDataCounts", String.valueOf(this.e)), jpu.a("from", "KMP"), jpu.a("typeList", i04.j0(((LinkedHashMap) this.f).entrySet(), "#", null, null, 0, null, new g1a() { // from class: tb.zzk
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    CharSequence d;
                    d = a0l.d((Map.Entry) obj);
                    return d;
                }
            }, 30, null))));
        }
    }
}
