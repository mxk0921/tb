package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.taolive.sdk.model.message.ExplainBehaviorReportMessage;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uo8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = uo8.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f29531a = true;
        public final long b;
        public ExplainBehaviorReportMessage.Segment c;

        static {
            t2o.a(295700133);
        }

        public a(long j) {
            this.b = j;
        }
    }

    static {
        t2o.a(295700132);
    }

    public static void a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f38b7c", new Object[]{ux9Var});
        } else if (ux9Var != null) {
            Queue<to8> queue = ux9Var.S;
            if (queue != null) {
                ((LinkedList) queue).clear();
            }
            Queue<to8> queue2 = ux9Var.R;
            if (queue2 != null) {
                ((LinkedList) queue2).clear();
            }
        }
    }

    public static void b(Queue<to8> queue, to8 to8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9702540", new Object[]{queue, to8Var});
        } else if (queue != null && to8Var != null) {
            while (queue.size() >= nh4.W0()) {
                queue.poll();
            }
            queue.offer(to8Var);
        }
    }

    public static long c(ux9 ux9Var) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e5903c7", new Object[]{ux9Var})).longValue();
        }
        if (ux9Var == null) {
            return 0L;
        }
        if (ux9Var.x() != null) {
            j = ux9Var.x().d();
        } else {
            j = 0;
        }
        if (ux9Var.j() != null) {
            j2 = ux9Var.j().n();
        } else {
            j2 = 0;
        }
        if (!nh4.p0() || j <= 0) {
            return j2;
        }
        return j;
    }

    public static void e(a aVar, Queue<to8> queue, String str, long j) {
        ExplainBehaviorReportMessage.Segment segment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e066bfe6", new Object[]{aVar, queue, str, new Long(j)});
        } else if (aVar != null && (segment = aVar.c) != null) {
            if (zqq.h(segment.explainEndTime) < j) {
                aVar.c.explainEndTime = String.valueOf(j);
            }
            g(Collections.singletonList(aVar.c), queue, str);
            h(aVar.c, str, "endExplainGoods", true);
        }
    }

    public static void f(ux9 ux9Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7112ba", new Object[]{ux9Var, str, new Long(j)});
        } else if (nh4.D() && ux9Var != null) {
            String userId = v2s.o().u().getUserId();
            long c = c(ux9Var);
            long currentTimeMillis = System.currentTimeMillis();
            to8 to8Var = new to8(userId, str, c, currentTimeMillis, j);
            to8 to8Var2 = new to8(userId, str, c, currentTimeMillis, j);
            b(ux9Var.S, to8Var);
            b(ux9Var.R, to8Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(List<ExplainBehaviorReportMessage.Segment> list, Queue<to8> queue, String str) {
        HashMap hashMap;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce98f64", new Object[]{list, queue, str});
        } else if (list != null && !list.isEmpty() && queue != null && !queue.isEmpty() && kkr.i().o() != null) {
            HashMap<String, String> hashMap2 = new HashMap<>();
            boolean z = false;
            for (int i2 = 0; i2 < list.size(); i2++) {
                ExplainBehaviorReportMessage.Segment segment = list.get(i2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("explainTopicId", String.valueOf(segment.explainTopicId));
                hashMap3.put("explainItemId", String.valueOf(segment.explainItemId));
                hashMap3.put("explainStartTime", segment.explainStartTime);
                hashMap3.put("explainEndTime", segment.explainEndTime);
                boolean z2 = false;
                while (queue.peek() != null) {
                    to8 peek = queue.peek();
                    if (peek.b >= zqq.h(segment.explainStartTime)) {
                        if (peek.b <= zqq.h(segment.explainStartTime) || peek.b > zqq.h(segment.explainEndTime)) {
                            break;
                        }
                        if (hashMap3.containsKey(peek.f28840a)) {
                            Map map = (Map) hashMap3.get(peek.f28840a);
                            int intValue = ((Integer) map.get("count")).intValue();
                            int intValue2 = ((Integer) map.get("explainCurrentGoodsCount")).intValue();
                            map.put("count", Integer.valueOf(intValue + 1));
                            if (segment.explainItemId == peek.c) {
                                intValue2++;
                            }
                            map.put("explainCurrentGoodsCount", Integer.valueOf(intValue2));
                            hashMap = map;
                        } else {
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("count", 1);
                            if (segment.explainItemId == peek.c) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            hashMap4.put("explainCurrentGoodsCount", Integer.valueOf(i));
                            hashMap = hashMap4;
                        }
                        hashMap3.put(peek.f28840a, hashMap);
                        queue.poll();
                        z = true;
                        z2 = true;
                    } else {
                        queue.poll();
                    }
                }
                if (z2) {
                    hashMap2.put(TBRunTimePermission.EXPLAIN_PARAM_NAME + String.valueOf(i2 + 1), fkx.i(hashMap3));
                }
            }
            hashMap2.put("explainType", str);
            if (z) {
                kkr.i().o().c("explainGoodsBehavior", hashMap2);
            }
        }
    }

    public static void h(ExplainBehaviorReportMessage.Segment segment, String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3d58cc", new Object[]{segment, str, str2, new Boolean(z)});
        } else if (segment != null && kkr.i().o() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("explainType", str);
            hashMap.put("liveId", String.valueOf(segment.liveId));
            hashMap.put("itemId", String.valueOf(segment.explainItemId));
            hashMap.put("explainTopicId", segment.explainTopicId);
            hashMap.put("explainStartTime", segment.explainStartTime);
            if (TextUtils.equals(str2, "endExplainGoods")) {
                hashMap.put("explainEndTime", segment.explainEndTime);
                long h = zqq.h(segment.explainEndTime) - zqq.h(segment.explainStartTime);
                if (h >= 0) {
                    hashMap.put("watchExplainTime", String.valueOf(h));
                    if (z) {
                        str3 = "1";
                    } else {
                        str3 = "0";
                    }
                    hashMap.put("isLeaveRoom", str3);
                } else {
                    return;
                }
            }
            hashMap.put("systemTime", String.valueOf(System.currentTimeMillis()));
            kkr.i().o().c(str2, hashMap);
        }
    }

    public static void d(ExplainBehaviorReportMessage explainBehaviorReportMessage, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5f096c", new Object[]{explainBehaviorReportMessage, aVar});
        } else if (aVar != null) {
            if (aVar.f29531a) {
                if (zqq.h(explainBehaviorReportMessage.segmentList.get(0).explainStartTime) < aVar.b) {
                    explainBehaviorReportMessage.segmentList.get(0).explainStartTime = String.valueOf(aVar.b);
                }
                h(explainBehaviorReportMessage.segmentList.get(0), explainBehaviorReportMessage.explainType, "startExplainGoods", false);
                aVar.f29531a = false;
            }
            List<ExplainBehaviorReportMessage.Segment> list = explainBehaviorReportMessage.segmentList;
            aVar.c = list.get(list.size() - 1);
        }
    }
}
