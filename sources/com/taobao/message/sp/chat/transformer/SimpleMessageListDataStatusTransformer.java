package com.taobao.message.sp.chat.transformer;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Transformer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageListDataStatusTransformer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String VALUE_LOAD_MORE_END = "stopped";
    private static final String VALUE_LOAD_MORE_NO_DATA = "noMore";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SimpleListInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONArray cmd;
        public int status;

        static {
            t2o.a(551551008);
        }

        public static SimpleListInfo copyWithState(SharedState sharedState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleListInfo) ipChange.ipc$dispatch("5e438b42", new Object[]{sharedState});
            }
            SimpleListInfo simpleListInfo = (SimpleListInfo) sharedState.getRuntimeData("listStatus", SimpleListInfo.class, null);
            SimpleListInfo simpleListInfo2 = new SimpleListInfo();
            if (simpleListInfo != null) {
                simpleListInfo2.status = simpleListInfo.status;
                if (simpleListInfo.cmd != null) {
                    simpleListInfo2.cmd = new JSONArray(simpleListInfo.cmd);
                }
            }
            if (simpleListInfo2.cmd == null) {
                simpleListInfo2.cmd = new JSONArray();
            }
            return simpleListInfo2;
        }
    }

    static {
        t2o.a(551551007);
        t2o.a(537919673);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r5.oldHasMore != false) goto L_0x0083;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        if (r5.newHasMore != false) goto L_0x0083;
     */
    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.message.lab.comfrm.inner2.SharedState transform(com.taobao.message.lab.comfrm.core.Action r9, com.taobao.message.lab.comfrm.inner2.SharedState r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.sp.chat.transformer.SimpleMessageListDataStatusTransformer.transform(com.taobao.message.lab.comfrm.core.Action, com.taobao.message.lab.comfrm.inner2.SharedState):com.taobao.message.lab.comfrm.inner2.SharedState");
    }
}
