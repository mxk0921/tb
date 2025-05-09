package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.CDNMessagePayload;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.OpenArchMessageSource;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.OpenArchPMMessageType;
import com.taobao.kmp.nexus.arch.openArch.service.message.model.PMMessageResponse;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class epy implements nzf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f18752a;
    public String b;
    public OpenArchMessageSource c;
    public String d;
    public CDNMessagePayload e;
    public PMMessageResponse f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536581);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1004536580);
        t2o.a(1029701651);
    }

    public epy() {
        this(null, null, null, null, null, 31, null);
    }

    public final epy a(CDNMessagePayload cDNMessagePayload) {
        Object obj;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epy) ipChange.ipc$dispatch("6b0aedb9", new Object[]{this, cDNMessagePayload});
        }
        ckf.g(cDNMessagePayload, "cdnPayload");
        String data = cDNMessagePayload.getData();
        Object obj2 = null;
        if (data != null) {
            try {
                obj = Result.m1108constructorimpl(zp1.INSTANCE.a(data));
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            if (Result.m1114isFailureimpl(obj)) {
                obj = null;
            }
            str = (String) obj;
        } else {
            str = null;
        }
        this.f18752a = str;
        this.b = cDNMessagePayload.getTopic();
        cDNMessagePayload.getMsgId();
        Iterator<E> it = OpenArchPMMessageType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int value = ((OpenArchPMMessageType) next).getValue();
            Integer subType = cDNMessagePayload.getSubType();
            if (subType != null && value == subType.intValue()) {
                obj2 = next;
                break;
            }
        }
        OpenArchPMMessageType openArchPMMessageType = (OpenArchPMMessageType) obj2;
        this.c = OpenArchMessageSource.CDN;
        this.e = cDNMessagePayload;
        return this;
    }

    @Override // tb.nzf
    public String getUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this});
        }
        return this.d;
    }

    public final epy m(PMMessageResponse pMMessageResponse) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epy) ipChange.ipc$dispatch("4be921ec", new Object[]{this, pMMessageResponse});
        }
        ckf.g(pMMessageResponse, "pmMessageResponse");
        Map<String, Object> data = pMMessageResponse.getData();
        if (data != null) {
            this.f18752a = new KMPJsonObject(data).toJsonString();
        }
        this.b = pMMessageResponse.getTopic();
        pMMessageResponse.getMessageId();
        Iterator<E> it = OpenArchPMMessageType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int value = ((OpenArchPMMessageType) obj).getValue();
            Integer type = pMMessageResponse.getType();
            if (type != null && value == type.intValue()) {
                break;
            }
        }
        OpenArchPMMessageType openArchPMMessageType = (OpenArchPMMessageType) obj;
        this.c = OpenArchMessageSource.PM;
        this.f = pMMessageResponse;
        return this;
    }

    public final CDNMessagePayload n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CDNMessagePayload) ipChange.ipc$dispatch("4724c4d5", new Object[]{this});
        }
        return this.e;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this});
        }
        return this.f18752a;
    }

    public final OpenArchMessageSource p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchMessageSource) ipChange.ipc$dispatch("1078c2b2", new Object[]{this});
        }
        return this.c;
    }

    public final PMMessageResponse q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMMessageResponse) ipChange.ipc$dispatch("4ee254fa", new Object[]{this});
        }
        return this.f;
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.nzf
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public epy(String str, String str2, String str3, OpenArchMessageSource openArchMessageSource, String str4) {
        ckf.g(openArchMessageSource, SimpleMessageListData.SOURCE_NAME_MESSAGE);
        this.f18752a = str;
        this.b = str2;
        this.c = openArchMessageSource;
        this.d = str4;
    }

    public /* synthetic */ epy(String str, String str2, String str3, OpenArchMessageSource openArchMessageSource, String str4, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? OpenArchMessageSource.Undefined : openArchMessageSource, (i & 16) != 0 ? null : str4);
    }
}
