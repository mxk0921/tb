package com.alibaba.security.wukong.pipe;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ab;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.vb;
import com.alibaba.security.ccrc.service.build.yb;
import com.alibaba.security.ccrc.service.build.zb;
import com.alibaba.security.client.smart.core.core.WukongNativeManager;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.l2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RiskDataPipeManager implements yb, IKeep {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_PIPE_EXCEPTION = "-1";
    public static final String DUPLICATE_PIPE_REGISTER = "2";
    public static final int PIPE_RESET = 70167;
    public static final String PIPE_RESULT_ERROR_CODE_KEY = "ec";
    public static final String PIPE_RESULT_ERROR_MSG_KEY = "em";
    public static final String PIPE_RESULT_STATUS_KEY = "e";
    public static final int PIPE_STATUS_DISABLE = 1;
    public static final int PIPE_STATUS_INIT = 0;
    public static final int PIPE_STATUS_REGISTERED = 2;
    public static final int PIPE_STATUS_REGISTER_FAILED = 3;
    public static final int PIPE_UNREGISTER = 70163;
    public static final String TAG = "RiskDataPipeManager";
    public final String mCcrcCode;
    public volatile int mCurrentPipeStatus = 0;
    public SyncPipeConfig mSyncPipeConfig;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f2925a = "0";
        public static final String b = "1";
        public String c = "0";
        public String d;
        public String e;
        public String f;
    }

    public RiskDataPipeManager(String str) {
        this.mCcrcCode = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Ab ab, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674d9789", new Object[]{this, ab, str, str2, str3});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(ab.b).setCcrcCode(this.mCcrcCode).setPhase("error").setOperation(str).setStatus(-1).addParam("sgCode", str2).addParam("errorMsg", str3).build());
        }
    }

    public static a getCallbackResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a5df77f4", new Object[]{str});
        }
        String[] split = str.split("_");
        a aVar = new a();
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                if (i == 0) {
                    aVar.c = split[i];
                } else if (i == 1) {
                    aVar.d = split[i];
                } else if (i == 2) {
                    aVar.e = split[i];
                } else if (i == 3) {
                    aVar.f = split[i];
                }
            }
        }
        return aVar;
    }

    public static String getPipeOperation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dda2027", new Object[]{new Integer(i)});
        }
        if (i == 70163) {
            return C1174ka.a.x;
        }
        return C1174ka.a.y;
    }

    public static boolean isDuplicatePipeRegister(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf2ef127", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !"2".equals(str)) {
            return false;
        }
        return true;
    }

    public static void onPipeRegistered(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fddb7e0", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            a callbackResult = getCallbackResult(str);
            Ab a2 = zb.a().a(callbackResult.d, callbackResult.e);
            if ("1".equals(callbackResult.c)) {
                str2 = C1174ka.a.t;
            } else {
                str2 = C1174ka.a.u;
            }
            trackPipeCallback(str2, callbackResult, a2);
            if ("1".equals(callbackResult.c)) {
                zb.a().b(callbackResult.d, callbackResult.e);
            }
        }
    }

    private Pair<String, String> parseError(HashMap<String, Object> hashMap) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("919eeda1", new Object[]{this, hashMap});
        }
        if (hashMap.containsKey("em")) {
            str = String.valueOf(hashMap.get("em"));
        } else {
            str = "default msg";
        }
        if (hashMap.containsKey(PIPE_RESULT_ERROR_CODE_KEY)) {
            str2 = String.valueOf(hashMap.get(PIPE_RESULT_ERROR_CODE_KEY));
        } else {
            str2 = "-1";
        }
        return new Pair<>(str2, str);
    }

    public static void trackPipeCallback(final String str, final a aVar, final Ab ab) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70fd0b19", new Object[]{str, aVar, ab});
        } else if (ab != null) {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.wlz
                @Override // java.lang.Runnable
                public final void run() {
                    RiskDataPipeManager.a(Ab.this, str, aVar);
                }
            });
        }
    }

    private void trackPipeException(final Ab ab, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2916a1e", new Object[]{this, ab, str, str2, str3});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.ulz
                @Override // java.lang.Runnable
                public final void run() {
                    RiskDataPipeManager.this.a(ab, str3, str, str2);
                }
            });
        }
    }

    private void trackPipeRegister(final int i, final Ab ab, final SyncPipeConfig syncPipeConfig, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6802ec", new Object[]{this, new Integer(i), ab, syncPipeConfig, str, str2});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.xlz
                @Override // java.lang.Runnable
                public final void run() {
                    RiskDataPipeManager.this.a(ab, i, str, str2, syncPipeConfig);
                }
            });
        }
    }

    private void trackPipeWrite(final int i, final Ab ab, final SyncPipeConfig syncPipeConfig, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25afefea", new Object[]{this, new Integer(i), ab, syncPipeConfig, str, str2, str3, str4});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.vlz
                @Override // java.lang.Runnable
                public final void run() {
                    RiskDataPipeManager.this.a(ab, i, str, str2, syncPipeConfig, str3, str4);
                }
            });
        }
    }

    private boolean unregisterOrResetPipe(Ab ab, SyncPipeConfig syncPipeConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("194cc894", new Object[]{this, ab, syncPipeConfig, new Integer(i)})).booleanValue();
        }
        if (vb.c().b() && this.mCurrentPipeStatus == 2 && syncPipeConfig != null) {
            HashMap<String, Object> a2 = WukongNativeManager.c().a(syncPipeConfig.bizId, i);
            if (a2 == null || a2.isEmpty()) {
                trackPipeException(ab, "-1", "Null unregister result found", getPipeOperation(i));
            } else {
                try {
                    Object obj = a2.get("e");
                    if (obj != null && ((Integer) obj).intValue() == 0) {
                        return true;
                    }
                    Pair<String, String> parseError = parseError(a2);
                    trackPipeException(ab, (String) parseError.first, (String) parseError.second, getPipeOperation(i));
                    return false;
                } catch (Throwable th) {
                    trackPipeException(ab, "-1", th.getMessage(), getPipeOperation(i));
                    return false;
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.security.ccrc.service.build.yb
    public SyncPipeConfig getSyncPipeConfig(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SyncPipeConfig) ipChange.ipc$dispatch("ae5c4e4", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        String a2 = WukongNativeManager.c().a(list);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return (SyncPipeConfig) JsonUtils.parseObject(a2, (Class<Object>) SyncPipeConfig.class);
    }

    @Override // com.alibaba.security.ccrc.service.build.yb
    public void registerPipe(Ab ab, List<String> list) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d19c56c", new Object[]{this, ab, list});
        } else if (!vb.c().b() || list == null || list.isEmpty()) {
            this.mCurrentPipeStatus = 1;
        } else {
            SyncPipeConfig syncPipeConfig = getSyncPipeConfig(list);
            this.mSyncPipeConfig = syncPipeConfig;
            if (ab == null || syncPipeConfig == null || (arrayList = syncPipeConfig.crc32Hashs) == null || arrayList.isEmpty()) {
                this.mCurrentPipeStatus = 1;
            } else if (this.mCurrentPipeStatus != 2) {
                WukongNativeManager c = WukongNativeManager.c();
                SyncPipeConfig syncPipeConfig2 = this.mSyncPipeConfig;
                HashMap<String, Object> a2 = c.a(syncPipeConfig2.bizId, syncPipeConfig2.crc32Hashs);
                if (a2 == null || a2.isEmpty()) {
                    trackPipeRegister(-1, ab, this.mSyncPipeConfig, "-1", "Null pipe register result found");
                    return;
                }
                try {
                    Object obj = a2.get("e");
                    if (obj != null && ((Integer) obj).intValue() == 0) {
                        this.mCurrentPipeStatus = 2;
                        trackPipeRegister(0, ab, this.mSyncPipeConfig, "0", "");
                        return;
                    }
                    Pair<String, String> parseError = parseError(a2);
                    if (isDuplicatePipeRegister((String) parseError.first)) {
                        trackPipeRegister(0, ab, this.mSyncPipeConfig, (String) parseError.first, (String) parseError.second);
                        this.mCurrentPipeStatus = 2;
                        return;
                    }
                    this.mCurrentPipeStatus = 3;
                    trackPipeRegister(-1, ab, this.mSyncPipeConfig, (String) parseError.first, (String) parseError.second);
                } catch (Throwable th) {
                    this.mCurrentPipeStatus = 3;
                    trackPipeRegister(-1, ab, this.mSyncPipeConfig, "-1", th.getMessage());
                }
            }
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.yb
    public void resetPipeData(Ab ab) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49339071", new Object[]{this, ab});
        } else {
            unregisterOrResetPipe(ab, this.mSyncPipeConfig, PIPE_RESET);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.yb
    public void unregisterPipe(Ab ab) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787d8994", new Object[]{this, ab});
            return;
        }
        SyncPipeConfig syncPipeConfig = this.mSyncPipeConfig;
        if (syncPipeConfig != null && unregisterOrResetPipe(ab, syncPipeConfig, PIPE_UNREGISTER)) {
            this.mCurrentPipeStatus = 0;
            zb.a().a(String.valueOf(this.mSyncPipeConfig.bizId));
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.yb
    public boolean writeRiskData(Ab ab, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec25eaf0", new Object[]{this, ab, str})).booleanValue();
        }
        if (!(!vb.c().b() || this.mCurrentPipeStatus == 0 || this.mCurrentPipeStatus == 1 || this.mSyncPipeConfig == null)) {
            if (this.mCurrentPipeStatus == 3 || TextUtils.isEmpty(str)) {
                trackPipeWrite(-1, ab, this.mSyncPipeConfig, "-1", "Pipe register failed ", str, "");
            } else {
                HashMap<String, Object> a2 = WukongNativeManager.c().a(this.mSyncPipeConfig.bizId, str);
                if (a2 == null || a2.isEmpty()) {
                    trackPipeWrite(-1, ab, this.mSyncPipeConfig, "-1", "Pipe writing failed with null result", str, "");
                    return false;
                }
                try {
                    Object obj = a2.get("e");
                    if (obj == null || ((Integer) obj).intValue() != 0) {
                        Pair<String, String> parseError = parseError(a2);
                        SyncPipeConfig syncPipeConfig = this.mSyncPipeConfig;
                        String str2 = (String) parseError.first;
                        trackPipeWrite(-1, ab, syncPipeConfig, str2, "Pipe writing failed with error: " + ((String) parseError.second), str, "");
                        return false;
                    }
                    int intValue = ((Integer) a2.get("t")).intValue();
                    zb.a().a(String.valueOf(this.mSyncPipeConfig.bizId), String.valueOf(intValue), ab);
                    trackPipeWrite(0, ab, this.mSyncPipeConfig, "0", "SUCCESS", str, String.valueOf(intValue));
                    return true;
                } catch (Throwable th) {
                    trackPipeWrite(-1, ab, this.mSyncPipeConfig, "-1", th.getMessage(), str, "");
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Ab ab, int i, String str, String str2, SyncPipeConfig syncPipeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6bf46f", new Object[]{this, ab, new Integer(i), str, str2, syncPipeConfig});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(ab.b).setCcrcCode(this.mCcrcCode).setPhase("init").setOperation(C1174ka.a.v).setStatus(i).addParam("sgCode", str).addParam("errorMsg", str2).addParam("bizId", Integer.valueOf(syncPipeConfig.bizId)).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Ab ab, int i, String str, String str2, SyncPipeConfig syncPipeConfig, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a9de03", new Object[]{this, ab, new Integer(i), str, str2, syncPipeConfig, str3, str4});
        } else {
            TrackManager.track(TrackLog.newBuilder().setpId(ab.b).setCcrcCode(this.mCcrcCode).setPhase("detect").setOperation(C1174ka.a.w).setStatus(i).addParam("sgCode", str).addParam("errorMsg", str2).addParam("bizId", Integer.valueOf(syncPipeConfig.bizId)).addParam("riskData", str3).addParam(l2o.COL_TASK, str4).addParam("pipeStatus", Integer.valueOf(this.mCurrentPipeStatus)).build());
        }
    }

    public static /* synthetic */ void a(Ab ab, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbd527c", new Object[]{ab, str, aVar});
            return;
        }
        TrackLog.Builder addParam = TrackLog.newBuilder().setpId(ab.b).setMetaId(ab.e).setSampleId(ab.d).setCcrcCode(ab.f2541a).setPhase("detect").setOperation(str).setStatus(0).addParam("eventId", ab.c);
        String str2 = "";
        TrackLog.Builder addParam2 = addParam.addParam("traceId", aVar == null ? str2 : aVar.f).addParam(l2o.COL_TASK, aVar == null ? str2 : aVar.e);
        if (aVar != null) {
            str2 = aVar.d;
        }
        TrackManager.track(addParam2.addParam("bizId", str2).build());
    }
}
