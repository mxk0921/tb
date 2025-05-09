package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.logger.EventLogger;
import com.taobao.tinct.ITinctOperater;
import com.taobao.tinct.impl.collect.ChangeRecord;
import com.taobao.tinct.impl.collect.MonitorLauncher;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bi3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public File f16398a;
    public Context b;
    public Set<t0e> c;
    public final nwt d;
    public ci3 e;
    public ChangeRecord f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static final bi3 INSTANCE = new bi3();
    }

    public static bi3 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bi3) ipChange.ipc$dispatch("f3926dac", new Object[0]);
        }
        return b.INSTANCE;
    }

    public static void y(tvc tvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("500a4b5d", new Object[]{tvcVar});
        } else {
            kwt.o(tvcVar);
        }
    }

    public final void A(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eda2df3", new Object[]{this, customChangeInfo});
            return;
        }
        this.f.customInfo.put(customChangeInfo.getHashKey(), customChangeInfo);
        this.e.e(this.f);
        p(customChangeInfo);
    }

    public synchronized void d(t0e t0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a860650", new Object[]{this, t0eVar});
            return;
        }
        if (this.c == null) {
            this.c = Collections.synchronizedSet(new HashSet());
        }
        this.c.add(t0eVar);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6349af93", new Object[]{this});
        } else {
            pwt.b().a(new Runnable() { // from class: tb.ai3
                @Override // java.lang.Runnable
                public final void run() {
                    bi3.this.k();
                }
            });
        }
    }

    public ChangeRecord f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChangeRecord) ipChange.ipc$dispatch("cb0fbdca", new Object[]{this});
        }
        return this.f;
    }

    public OrangeChangeInfo h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeChangeInfo) ipChange.ipc$dispatch("20ce7e1a", new Object[]{this, str});
        }
        ConcurrentHashMap<String, OrangeChangeInfo> concurrentHashMap = this.f.orangeChangeMap;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return null;
        }
        return this.f.orangeChangeMap.get(str);
    }

    public ITinctOperater i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITinctOperater) ipChange.ipc$dispatch("d1993449", new Object[]{this});
        }
        return this.d;
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.b = context;
        try {
            File filesDir = this.b.getFilesDir();
            this.f16398a = new File(filesDir, "orange_config/" + OConstant.ENV.valueOf(com.taobao.tinct.impl.config.a.f()).getDes());
            n(context);
            if (kwt.e() == null) {
                y(new r71());
            }
            pwt.b().a(new Runnable() { // from class: tb.zh3
                @Override // java.lang.Runnable
                public final void run() {
                    bi3.this.l();
                }
            });
            MonitorLauncher.c(context, this);
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge("tinct", "ChangeDataManager", "init failed: " + e.getMessage());
        }
    }

    public final /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6a2bc3", new Object[]{this});
            return;
        }
        this.d.d();
        w();
    }

    public final /* synthetic */ void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa473920", new Object[]{this});
            return;
        }
        try {
            kwt.g(this.f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final /* synthetic */ void m(BaseChangeInfo baseChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf884b49", new Object[]{this, baseChangeInfo});
            return;
        }
        for (t0e t0eVar : this.c) {
            if (t0eVar != null) {
                try {
                    t0eVar.a(baseChangeInfo);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca28af57", new Object[]{this});
        } else if (this.e != null && this.f != null) {
            Log.e("ChangeDataManager", "loadPatchInfo");
            this.f.inlinePatchInfo = this.e.b();
            this.f.instantPatchInfo = this.e.c();
        }
    }

    public final void p(final BaseChangeInfo baseChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700c4f4", new Object[]{this, baseChangeInfo});
            return;
        }
        Set<t0e> set = this.c;
        if (set != null && !set.isEmpty()) {
            pwt.b().a(new Runnable() { // from class: tb.yh3
                @Override // java.lang.Runnable
                public final void run() {
                    bi3.this.m(baseChangeInfo);
                }
            });
        }
    }

    public void s(h9f h9fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95372b", new Object[]{this, h9fVar});
            return;
        }
        try {
            synchronized (this) {
                this.f.inlinePatchInfo = h9fVar;
            }
            EventLogger.builder(6).setData("type", h9fVar.getChangeType().toString()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, h9fVar.getVersion()).log();
            p(h9fVar);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("ChangeDataManager", "Exception onPatchChanged:  " + e.getMessage());
        }
    }

    public void u(InstantPatchChangeInfo instantPatchChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd39bec", new Object[]{this, instantPatchChangeInfo});
            return;
        }
        try {
            synchronized (this) {
                this.f.instantPatchInfo = instantPatchChangeInfo;
            }
            EventLogger.builder(6).setData("type", instantPatchChangeInfo.getChangeType().toString()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, instantPatchChangeInfo.getVersion()).log();
            p(instantPatchChangeInfo);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("ChangeDataManager", "Exception onPatchChanged:  " + e.getMessage());
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96cb6ba", new Object[]{this});
        } else {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo("tinctInfo", "");
        }
    }

    public void z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c06b45", new Object[]{this, context});
            return;
        }
        n(context);
        x();
    }

    public bi3() {
        this.f = new ChangeRecord();
        this.d = new nwt();
        this.e = null;
        this.c = null;
        this.g = false;
    }

    public final void n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2caa5a", new Object[]{this, context});
        } else if (!this.g) {
            Log.e("ChangeDataManager", "loadChangeRecord");
            ci3 ci3Var = new ci3(context);
            this.e = ci3Var;
            this.f = ci3Var.a();
            this.g = true;
        }
    }

    public synchronized void t(OrangeChangeInfo orangeChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd47809", new Object[]{this, orangeChangeInfo});
        } else if (orangeChangeInfo != null) {
            try {
                String nameSpace = orangeChangeInfo.getNameSpace();
                if (this.f.orangeChangeMap.containsKey(nameSpace)) {
                    OrangeChangeInfo orangeChangeInfo2 = this.f.orangeChangeMap.get(nameSpace);
                    if (!orangeChangeInfo2.getVersion().equals(orangeChangeInfo.getVersion())) {
                        orangeChangeInfo.setStatus(1);
                        this.f.orangeChangeMap.put(nameSpace, orangeChangeInfo);
                        EventLogger.builder(6).setData("type", orangeChangeInfo.getChangeType().toString()).setData(NotificationStyle.NOTIFICATION_STYLE, orangeChangeInfo.getNameSpace()).setData("newVer", orangeChangeInfo.getVersion()).setData(pg1.ATOM_EXT_gray, String.valueOf(orangeChangeInfo.isGray())).setData("oldVer", orangeChangeInfo2.getVersion()).log();
                    } else if (orangeChangeInfo2.update(orangeChangeInfo)) {
                        orangeChangeInfo.setStatus(1);
                        orangeChangeInfo.setUsed(orangeChangeInfo2.isUsed());
                        EventLogger.builder(6).setData("type", orangeChangeInfo.getChangeType().toString()).setData(NotificationStyle.NOTIFICATION_STYLE, orangeChangeInfo.getNameSpace()).setData("newVer", orangeChangeInfo.getVersion()).setData(pg1.ATOM_EXT_gray, String.valueOf(orangeChangeInfo.isGray())).log();
                    } else {
                        new StringBuilder("The orange have not changed: ").append(orangeChangeInfo.getNameSpace());
                        return;
                    }
                } else {
                    if (orangeChangeInfo.isGray()) {
                        orangeChangeInfo.setStatus(1);
                    } else if (!new File(this.f16398a, orangeChangeInfo.getNameSpace()).exists()) {
                        String nameSpace2 = orangeChangeInfo.getNameSpace();
                        String version = orangeChangeInfo.getVersion();
                        StringBuilder sb = new StringBuilder("Orange file not exist!! Init Orange Config ");
                        sb.append(nameSpace2);
                        sb.append(", ver=");
                        sb.append(version);
                        return;
                    } else {
                        orangeChangeInfo.setStatus(1);
                    }
                    this.f.orangeChangeMap.put(nameSpace, orangeChangeInfo);
                    EventLogger.builder(6).setData("type", orangeChangeInfo.getChangeType().toString()).setData(NotificationStyle.NOTIFICATION_STYLE, orangeChangeInfo.getNameSpace()).setData("newVer", orangeChangeInfo.getVersion()).setData(pg1.ATOM_EXT_gray, String.valueOf(orangeChangeInfo.isGray())).log();
                }
                kwt.m(orangeChangeInfo, "change");
                this.e.e(this.f);
                p(orangeChangeInfo);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("ChangeDataManager", "Exception onOrangeChanged:  " + e.getMessage());
            }
        }
    }

    public synchronized boolean q(ABChangeInfo aBChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44befaed", new Object[]{this, aBChangeInfo})).booleanValue();
        } else if (aBChangeInfo == null) {
            return false;
        } else {
            try {
                int hashCode = aBChangeInfo.hashCode();
                if (!this.f.abInfoMap.containsKey(Integer.valueOf(hashCode))) {
                    this.f.abInfoMap.put(Integer.valueOf(hashCode), aBChangeInfo);
                    EventLogger.builder(6).setData("type", aBChangeInfo.getChangeType().toString()).setData("eid", aBChangeInfo.getExperimentId()).setData("bid", aBChangeInfo.getBucketId()).setData(MspDBHelper.BizEntry.COLUMN_NAME_PID, aBChangeInfo.getPublishId()).log();
                } else if (!aBChangeInfo.getPublishId().equals(this.f.abInfoMap.get(Integer.valueOf(hashCode)).getPublishId())) {
                    this.f.abInfoMap.put(Integer.valueOf(hashCode), aBChangeInfo);
                    EventLogger.builder(6).setData("type", aBChangeInfo.getChangeType().toString()).setData("eid", aBChangeInfo.getExperimentId()).setData("bid", aBChangeInfo.getBucketId()).setData(MspDBHelper.BizEntry.COLUMN_NAME_PID, aBChangeInfo.getPublishId()).log();
                } else {
                    String experimentId = aBChangeInfo.getExperimentId();
                    String bucketId = aBChangeInfo.getBucketId();
                    String publishId = aBChangeInfo.getPublishId();
                    StringBuilder sb = new StringBuilder("Activate Same ABTest ");
                    sb.append(experimentId);
                    sb.append("-");
                    sb.append(bucketId);
                    sb.append("-");
                    sb.append(publishId);
                    sb.append(":");
                    return false;
                }
                p(aBChangeInfo);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("ChangeDataManager", "Exception onABChanged:  " + e.getMessage());
                return false;
            }
        }
    }

    public synchronized boolean r(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6d0516d", new Object[]{this, customChangeInfo})).booleanValue();
        }
        CustomChangeInfo customChangeInfo2 = this.f.customInfo.get(customChangeInfo.getHashKey());
        if (customChangeInfo2 == null) {
            EventLogger.builder(6).setData("type", customChangeInfo.getCustomType()).setData("config", customChangeInfo.getConfigType()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, customChangeInfo.getVersion()).setData("isGray", String.valueOf(customChangeInfo.isGray())).log();
            if (customChangeInfo.isFull()) {
                customChangeInfo.getTinctTag();
                customChangeInfo.updateFullExpireTime();
                A(customChangeInfo);
                return false;
            }
            customChangeInfo.getTinctTag();
        } else if (customChangeInfo.isFull()) {
            if (customChangeInfo2.getFullExpireTime() == -1 || !TextUtils.equals(customChangeInfo2.getVersion(), customChangeInfo.getVersion())) {
                customChangeInfo2.getTinctTag();
                customChangeInfo.getTinctTag();
                customChangeInfo.updateFullExpireTime();
                A(customChangeInfo);
                return false;
            }
            customChangeInfo.getTinctTag();
            return false;
        } else if (customChangeInfo2.getFullExpireTime() != -1 || !TextUtils.equals(customChangeInfo2.getVersion(), customChangeInfo.getVersion())) {
            EventLogger.builder(6).setData("type", customChangeInfo.getCustomType()).setData("config", customChangeInfo.getConfigType()).setData(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, customChangeInfo.getVersion()).setData("isGray", String.valueOf(customChangeInfo.isGray())).setData("oldVer", customChangeInfo2.getVersion()).log();
            customChangeInfo.getHashKey();
            customChangeInfo2.getVersion();
            customChangeInfo.getVersion();
        } else {
            customChangeInfo.getTinctTag();
            if (!customChangeInfo2.isStatistics() || com.taobao.tinct.impl.config.a.m(customChangeInfo) == 1) {
                kwt.c(customChangeInfo2, "change");
            }
            return false;
        }
        A(customChangeInfo);
        return true;
    }

    public synchronized boolean v(vks vksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c48d20b4", new Object[]{this, vksVar})).booleanValue();
        }
        if (vksVar != null && !TextUtils.isEmpty(vksVar.getBucketId())) {
            List<vks> list = this.f.touchStoneInfo.get(vksVar.getBizName());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(vksVar);
                this.f.touchStoneInfo.put(vksVar.getBizName(), arrayList);
            } else if (list.contains(vksVar)) {
                return false;
            } else {
                list.add(vksVar);
            }
            EventLogger.builder(6).setData("type", ChangeType.TOUCH_STONE.toString()).setData("biz", vksVar.getBizName()).setData("bucket", vksVar.getBucketId()).log();
            p(vksVar);
            return true;
        }
        return false;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6775fb1c", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (OrangeChangeInfo orangeChangeInfo : this.f.orangeChangeMap.values()) {
            if (orangeChangeInfo.isGray()) {
                sb.append(orangeChangeInfo.getTinctTag());
                sb.append("^");
            }
        }
        InstantPatchChangeInfo instantPatchChangeInfo = this.f.instantPatchInfo;
        if (instantPatchChangeInfo != null) {
            sb.append(instantPatchChangeInfo.getTinctTag());
            sb.append("^");
        }
        h9f h9fVar = this.f.inlinePatchInfo;
        if (h9fVar != null) {
            sb.append(h9fVar.getTinctTag());
            sb.append("^");
        }
        for (CustomChangeInfo customChangeInfo : this.f.customInfo.values()) {
            if (customChangeInfo.getFullExpireTime() == -1) {
                sb.append(customChangeInfo.getTinctTag());
                sb.append("^");
            }
        }
        for (n48 n48Var : this.f.dynamicChangeInfos) {
            sb.append(n48Var.getTinctTag());
            sb.append("^");
        }
        if (sb.length() > 0) {
            String d = doh.d(String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
            String sb2 = sb.deleteCharAt(sb.length() - 1).toString();
            UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
            crashCaughtHeader.addHeaderInfo("snapshotID", d);
            crashCaughtHeader.addHeaderInfo("tinctInfo", sb2);
            Log.e("ChangeDataManager", "setLaunchTinct " + sb.toString());
        }
    }
}
