package tb;

import android.text.TextUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ch1 implements s8n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f17055a;
    public final Map<String, Set<Integer>> b = new HashMap();
    public final List<AttachedResponse> c = new ArrayList();
    public boolean d;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            ((ArrayList) this.c).clear();
        }
    }

    public List<AttachedResponse> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("deef0988", new Object[]{this});
        }
        return this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8d3ac7", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void d(RemoteMainResponse remoteMainResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f49bd1", new Object[]{this, remoteMainResponse});
            return;
        }
        JSONObject parseObject = JSON.parseObject(remoteMainResponse.getAttachedResponseStat());
        if (parseObject != null) {
            Map<String, Object> innerMap = parseObject.getInnerMap();
            if (innerMap != null) {
                this.f17055a = innerMap;
            }
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                f((AttachedResponse) it.next());
            }
            UnifyLog.c("NextRpc_AttachedQueue", "onMainResponse attachedStat=" + this.f17055a + ",isAllAttachedResponse=" + this.d + ",attachResponses=" + this.c, new Object[0]);
        }
    }

    public void e(AttachedResponse attachedResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0dc8e4", new Object[]{this, attachedResponse});
        } else if (attachedResponse != null) {
            f(attachedResponse);
            if (attachedResponse.isSucceed().booleanValue()) {
                int size = ((ArrayList) this.c).size() - 1;
                while (true) {
                    if (size < 0) {
                        size = 0;
                        break;
                    } else if (((AttachedResponse) ((ArrayList) this.c).get(size)).getSeqNum().intValue() <= attachedResponse.getSeqNum().intValue()) {
                        break;
                    } else {
                        size--;
                    }
                }
                ((ArrayList) this.c).add(size, attachedResponse);
                UnifyLog.c("NextRpc_AttachedQueue", "queue attachedStat=" + this.f17055a + ",isAllAttachedResponse=" + this.d + ",seqNum=" + attachedResponse.getSeqNum() + ",bizName=" + attachedResponse.getBizName(), new Object[0]);
            }
        }
    }

    public final void f(AttachedResponse attachedResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4a8bd8", new Object[]{this, attachedResponse});
        } else if (attachedResponse != null && this.f17055a != null) {
            String bizName = attachedResponse.getBizName();
            Integer seqNum = attachedResponse.getSeqNum();
            try {
                try {
                    if (this.f17055a.get(bizName) == null) {
                        str = "";
                    } else {
                        str = this.f17055a.get(bizName).toString();
                    }
                } catch (Exception e) {
                    UnifyLog.d("NextRpc_AttachedQueue", "recordAttachAndChangeStat exception:" + e.getMessage(), new Object[0]);
                    if (!this.f17055a.isEmpty()) {
                        return;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    int parseInt = Integer.parseInt(str);
                    Set set = (Set) ((HashMap) this.b).get(bizName);
                    if (set == null) {
                        set = new HashSet();
                        ((HashMap) this.b).put(bizName, set);
                    }
                    set.add(seqNum);
                    if (set.size() >= parseInt) {
                        this.f17055a.remove(bizName);
                    }
                    if (!this.f17055a.isEmpty()) {
                        return;
                    }
                    this.d = true;
                } else if (this.f17055a.isEmpty()) {
                    this.d = true;
                }
            } catch (Throwable th) {
                if (this.f17055a.isEmpty()) {
                    this.d = true;
                }
                throw th;
            }
        }
    }
}
