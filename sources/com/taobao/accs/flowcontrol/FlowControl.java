package com.taobao.accs.flowcontrol;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FlowControl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DELAY_MAX = -1;
    public static final int DELAY_MAX_BRUSH = -1000;
    public static final int HIGH_FLOW_CTRL = 2;
    public static final int HIGH_FLOW_CTRL_BRUSH = 3;
    public static final int LOW_FLOW_CTRL = 1;
    public static final int NO_FLOW_CTRL = 0;
    public static final String SERVICE_ALL = "ALL";
    public static final String SERVICE_ALL_BRUSH = "ALL_BRUSH";
    public static final int STATUS_FLOW_CTRL_ALL = 420;
    public static final int STATUS_FLOW_CTRL_BRUSH = 422;
    public static final int STATUS_FLOW_CTRL_CUR = 421;

    /* renamed from: a  reason: collision with root package name */
    public FlowCtrlInfoHolder f6057a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class FlowControlInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = -2259991484877844919L;
        public String bizId;
        public long delayTime;
        public long expireTime;
        public String serviceId;
        public long startTime;
        public int status;

        static {
            t2o.a(343933107);
        }

        public FlowControlInfo(String str, String str2, int i, long j, long j2, long j3) {
            this.serviceId = str;
            this.bizId = str2;
            this.status = i;
            this.delayTime = j;
            this.expireTime = j2 <= 0 ? 0L : j2;
            this.startTime = j3 <= 0 ? 0L : j3;
        }

        public boolean isExpired() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
            }
            if (System.currentTimeMillis() - (this.startTime + this.expireTime) > 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuffer stringBuffer = new StringBuffer("flow ctrl serviceId:");
            stringBuffer.append(this.serviceId);
            stringBuffer.append(" bizId:");
            stringBuffer.append(this.bizId);
            stringBuffer.append(" status:");
            stringBuffer.append(this.status);
            stringBuffer.append(" delayTime:");
            stringBuffer.append(this.delayTime);
            stringBuffer.append(" startTime:");
            stringBuffer.append(this.startTime);
            stringBuffer.append(" expireTime:");
            stringBuffer.append(this.expireTime);
            return stringBuffer.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class FlowCtrlInfoHolder implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 6307563052429742524L;
        public Map<String, FlowControlInfo> flowCtrlMap = null;

        static {
            t2o.a(343933108);
        }

        public FlowControlInfo get(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlowControlInfo) ipChange.ipc$dispatch("6b06b444", new Object[]{this, str, str2});
            }
            if (this.flowCtrlMap == null) {
                return null;
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            return this.flowCtrlMap.get(str);
        }

        public void put(String str, String str2, FlowControlInfo flowControlInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49b69ef9", new Object[]{this, str, str2, flowControlInfo});
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            if (this.flowCtrlMap == null) {
                this.flowCtrlMap = new HashMap();
            }
            this.flowCtrlMap.put(str, flowControlInfo);
        }
    }

    static {
        t2o.a(343933106);
    }

    public FlowControl(Context context) {
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5945de8", new Object[]{this});
            return;
        }
        FlowCtrlInfoHolder flowCtrlInfoHolder = this.f6057a;
        if (flowCtrlInfoHolder != null && flowCtrlInfoHolder.flowCtrlMap != null) {
            synchronized (this) {
                try {
                    Iterator<Map.Entry<String, FlowControlInfo>> it = this.f6057a.flowCtrlMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().isExpired()) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a52e6a3a", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        if (j != 0 && j2 > 0) {
            return true;
        }
        ALog.e("FlowControl", "error flow ctrl info", new Object[0]);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b4, code lost:
        if (r9.isExpired() != false) goto L_0x00be;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
        if (r4.isExpired() != false) goto L_0x00be;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00be, code lost:
        a();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:13:0x0038, B:15:0x0057, B:18:0x005e, B:23:0x0067, B:26:0x006e, B:29:0x0074, B:32:0x007b, B:35:0x0081, B:38:0x0088, B:58:0x00b0, B:61:0x00b8, B:63:0x00be, B:64:0x00c1), top: B:70:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:13:0x0038, B:15:0x0057, B:18:0x005e, B:23:0x0067, B:26:0x006e, B:29:0x0074, B:32:0x007b, B:35:0x0081, B:38:0x0088, B:58:0x00b0, B:61:0x00b8, B:63:0x00be, B:64:0x00c1), top: B:70:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:13:0x0038, B:15:0x0057, B:18:0x005e, B:23:0x0067, B:26:0x006e, B:29:0x0074, B:32:0x007b, B:35:0x0081, B:38:0x0088, B:58:0x00b0, B:61:0x00b8, B:63:0x00be, B:64:0x00c1), top: B:70:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.c(java.lang.String, java.lang.String):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014d A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:45:0x0137, B:50:0x014d, B:51:0x0164, B:53:0x016a), top: B:74:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int d(java.util.Map<java.lang.Integer, java.lang.String> r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.d(java.util.Map, java.lang.String):int");
    }
}
