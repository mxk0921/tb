package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.util.OpenArchMessageCheckResult;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e1h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18205a = false;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final Map<Integer, Integer> f = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$message_sdk$util$OpenArchMessageCheckResult;

        static {
            int[] iArr = new int[OpenArchMessageCheckResult.values().length];
            $SwitchMap$com$taobao$taolive$message_sdk$util$OpenArchMessageCheckResult = iArr;
            try {
                iArr[OpenArchMessageCheckResult.MessageCheckResultTopicNotMatch.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$message_sdk$util$OpenArchMessageCheckResult[OpenArchMessageCheckResult.MessageCheckResultMsgIDDuplicated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$message_sdk$util$OpenArchMessageCheckResult[OpenArchMessageCheckResult.MessageCheckResultPassed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$message_sdk$util$OpenArchMessageCheckResult[OpenArchMessageCheckResult.MessageCheckResultMsgDataEmpty.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public <T> void a(OpenArchMessageCheckResult openArchMessageCheckResult, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12287ed", new Object[]{this, openArchMessageCheckResult, tLiveMsg});
        } else if (this.f18205a) {
            int i = a.$SwitchMap$com$taobao$taolive$message_sdk$util$OpenArchMessageCheckResult[openArchMessageCheckResult.ordinal()];
            if (i == 1) {
                this.c++;
            } else if (i == 2) {
                this.b++;
            } else if (i == 4) {
                this.e++;
            }
            if (openArchMessageCheckResult != OpenArchMessageCheckResult.MessageCheckResultPassed) {
                d(tLiveMsg.toString());
            }
        }
    }

    public void b(TLiveMsg tLiveMsg, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7d9489", new Object[]{this, tLiveMsg, str});
        } else if (this.f18205a) {
            this.d++;
            Integer valueOf = Integer.valueOf(tLiveMsg.type);
            if (((HashMap) this.f).containsKey(valueOf)) {
                Map<Integer, Integer> map = this.f;
                ((HashMap) map).put(valueOf, Integer.valueOf(((Integer) ((HashMap) map).get(valueOf)).intValue() + 1));
            } else {
                ((HashMap) this.f).put(valueOf, 1);
            }
            if (str != null && !str.equals(tLiveMsg.topic)) {
                a(OpenArchMessageCheckResult.MessageCheckResultTopicNotMatch, tLiveMsg);
            }
            byte[] bArr = tLiveMsg.data;
            if (bArr == null || bArr.length == 0) {
                a(OpenArchMessageCheckResult.MessageCheckResultMsgDataEmpty, tLiveMsg);
            }
        }
    }

    public final <T> void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba4a90f", new Object[]{this, str});
            return;
        }
        k6s.a("MessageCheck", "MsgCheck " + str);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cff6e5a", new Object[]{this});
        } else if (nbl.g()) {
            this.f18205a = true;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            ((HashMap) this.f).clear();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ac5eae", new Object[]{this});
        } else if (nbl.g()) {
            this.f18205a = false;
            HashMap hashMap = new HashMap();
            hashMap.put("duplicateMsgIdCounts", String.valueOf(this.b));
            hashMap.put("notMatchTopicsCounts", String.valueOf(this.c));
            hashMap.put("msgCount", String.valueOf(this.d));
            hashMap.put("emptyDataCounts", String.valueOf(this.e));
            hashMap.put("from", "native");
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : ((HashMap) this.f).entrySet()) {
                sb.append((Integer) entry.getKey());
                sb.append('_');
                sb.append((Integer) entry.getValue());
                sb.append('#');
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            hashMap.put("typeList", sb.toString());
            d(fkx.i(hashMap));
            if (nbl.h()) {
                v2s.o().E().trackCustom(v2l.pageName4UT, 2101, a0l.UTARG1MSGCHECKSTAT, "", "", hashMap);
            }
        }
    }
}
