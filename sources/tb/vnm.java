package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.pre.LiveDetailPreRequestParams;
import com.taobao.taolive.room.pre.PreRequestImpl;
import com.taobao.taolive.room.pre.PreRequestInfo;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import java.util.concurrent.ConcurrentHashMap;
import tb.hlc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vnm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRE_CREATE_ROOM_REC = "isPreCreateRoomRec";
    public static final String TAG = "PreRequestManager";

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, PreRequestInfo> f30128a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static final vnm INSTANCE = new vnm();

        static {
            t2o.a(806355773);
        }
    }

    static {
        t2o.a(806355771);
    }

    public static vnm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vnm) ipChange.ipc$dispatch("d22bc6e", new Object[0]);
        }
        return b.INSTANCE;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            this.f30128a.clear();
        } catch (Exception unused) {
        }
    }

    public String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a72465fb", new Object[]{this, str, str2, str3});
        }
        StringBuilder sb = new StringBuilder("timemove_");
        sb.append(str);
        sb.append("_");
        if (str2 != null) {
            sb.append(str2);
        } else {
            sb.append(str3);
        }
        return sb.toString();
    }

    public PreRequestInfo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRequestInfo) ipChange.ipc$dispatch("4a22420c", new Object[]{this, str});
        }
        return this.f30128a.get(str);
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f10e754b", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && this.f30128a.containsKey(str)) {
            return true;
        }
        return false;
    }

    public void f(Intent intent, LiveDetailPreRequestParams liveDetailPreRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ca6329", new Object[]{this, intent, liveDetailPreRequestParams});
            return;
        }
        k(liveDetailPreRequestParams);
        eir.b(TAG, "preStartRequestDetail feedId:" + liveDetailPreRequestParams.feedId);
    }

    public void g(LiveDetailPreRequestParams liveDetailPreRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e72536", new Object[]{this, liveDetailPreRequestParams, str});
            return;
        }
        PreRequestInfo preRequestInfo = new PreRequestInfo();
        preRequestInfo.tbLiveDataProvider = new TBLiveDataProvider();
        preRequestInfo.params = liveDetailPreRequestParams;
        PreRequestImpl preRequestImpl = new PreRequestImpl();
        preRequestInfo.preRequest = preRequestImpl;
        preRequestImpl.startRealRequest(preRequestInfo);
        ConcurrentHashMap<String, PreRequestInfo> concurrentHashMap = this.f30128a;
        concurrentHashMap.put(PRE_CREATE_ROOM_REC + str, preRequestInfo);
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6b1a8a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && this.f30128a.containsKey(str)) {
            PreRequestImpl preRequestImpl = this.f30128a.get(str).preRequest;
            if (preRequestImpl != null) {
                preRequestImpl.removeResponseListener();
            }
            this.f30128a.remove(str);
        }
    }

    public void j(String str, hlc.a aVar, TBLiveDataProvider.c cVar) {
        PreRequestImpl preRequestImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a806b8f", new Object[]{this, str, aVar, cVar});
        } else if (!TextUtils.isEmpty(str) && this.f30128a.containsKey(str) && (preRequestImpl = this.f30128a.get(str).preRequest) != null) {
            preRequestImpl.setResponseListener(aVar, cVar);
        }
    }

    public final void k(LiveDetailPreRequestParams liveDetailPreRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c384b68", new Object[]{this, liveDetailPreRequestParams});
        } else if (liveDetailPreRequestParams == null) {
            eir.b(TAG, "params null");
        } else if (TextUtils.isEmpty(liveDetailPreRequestParams.feedId)) {
            eir.b(TAG, "params feedid null");
        } else {
            PreRequestInfo preRequestInfo = new PreRequestInfo();
            preRequestInfo.tbLiveDataProvider = new TBLiveDataProvider();
            preRequestInfo.params = liveDetailPreRequestParams;
            PreRequestImpl preRequestImpl = new PreRequestImpl();
            preRequestInfo.preRequest = preRequestImpl;
            preRequestImpl.startRealRequest(preRequestInfo);
            this.f30128a.put(liveDetailPreRequestParams.feedId, preRequestInfo);
            eir.b(TAG, "startRequest feedId:" + liveDetailPreRequestParams.feedId);
        }
    }

    public vnm() {
        this.f30128a = new ConcurrentHashMap<>();
    }

    public void h(LiveDetailPreRequestParams liveDetailPreRequestParams, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21492358", new Object[]{this, liveDetailPreRequestParams, str, str2, str3});
            return;
        }
        String b2 = b(str, str2, str3);
        PreRequestInfo preRequestInfo = this.f30128a.get(b2);
        if (preRequestInfo == null || preRequestInfo.responseStatus == 2) {
            PreRequestInfo preRequestInfo2 = new PreRequestInfo();
            preRequestInfo2.tbLiveDataProvider = new TBLiveDataProvider();
            preRequestInfo2.params = liveDetailPreRequestParams;
            PreRequestImpl preRequestImpl = new PreRequestImpl();
            preRequestInfo2.preRequest = preRequestImpl;
            preRequestImpl.startRealRequest(preRequestInfo2);
            this.f30128a.put(b2, preRequestInfo2);
            return;
        }
        o3s.d(TAG, "已经存在对应看点的预请求，跳过");
    }
}
