package com.alipay.mobile.monitor.track.spm.merge;

import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmUtils;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.MergeTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MergeTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Behavor.Builder f4274a;
    public int b;
    public int c;
    public String d;

    public MergeTask(MergeTracker mergeTracker) {
        merge(mergeTracker);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder("rid|");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        sb.append(":");
        return sb.toString();
    }

    public static String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (String str : map.keySet()) {
            if (MergeUtil.KEY_EXPOSED.equals(str)) {
                if (SpmUtils.isDebug) {
                    throw new IllegalArgumentException("\"exposed\"是保留字段，扩展参数中key不能使用\"exposed\"");
                }
            } else if (!MergeUtil.KEY_RID.equals(str) && !MergeUtil.getMergeBlackList().equals(str)) {
                sb.append(str);
                sb.append("|");
                sb.append(map.get(str));
                sb.append(";");
            }
        }
        sb.append("&");
        return sb.toString();
    }

    public Behavor.Builder getBehavorBuider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Behavor.Builder) ipChange.ipc$dispatch("9642ac2d", new Object[]{this});
        }
        return this.f4274a;
    }

    public String getBehavorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab786e17", new Object[]{this});
        }
        return this.d;
    }

    public MergeTask merge(MergeTracker mergeTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeTask) ipChange.ipc$dispatch("1bb0a4ed", new Object[]{this, mergeTracker});
        }
        if (mergeTracker == null) {
            return this;
        }
        String str = this.d;
        if (str != null && !str.equals(mergeTracker.getBehavorId())) {
            return this;
        }
        this.d = mergeTracker.getBehavorId();
        Behavor.Builder behavorBuilder = mergeTracker.getBehavorBuilder();
        if (behavorBuilder != null) {
            behavorBuilder.addExtParam("logtime", a());
        }
        if (this.f4274a == null) {
            e(behavorBuilder.build());
        } else {
            d(behavorBuilder.build());
        }
        return this;
    }

    public boolean needCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdb5b78", new Object[]{this})).booleanValue();
        }
        if (this.b >= MergeUtil.getMergedMaxSize() || this.c >= MergeUtil.getMergedMaxCount()) {
            return true;
        }
        return false;
    }

    public final void e(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2101d700", new Object[]{this, behavor});
            return;
        }
        if (this.f4274a == null) {
            Behavor.Builder builder = new Behavor.Builder(Constant.UCID);
            this.f4274a = builder;
            builder.setSeedID(behavor.getSeedID());
            this.f4274a.setBehaviourPro(behavor.getBehaviourPro()).setPageId(behavor.getPageId()).setLoggerLevel(behavor.getLoggerLevel());
            this.f4274a.setParam1(behavor.getParam1());
            this.f4274a.setParam2(behavor.getParam2());
            this.f4274a.setParam3(behavor.getParam3());
        }
        Map<String, String> extParams = behavor.getExtParams();
        StringBuilder sb = new StringBuilder("");
        if (extParams != null) {
            sb.append(b(extParams.get(MergeUtil.KEY_RID)));
            sb.append(c(extParams));
        }
        sb.append("__");
        String sb2 = sb.toString();
        this.f4274a.addExtParam(MergeUtil.KEY_EXPOSED, sb2);
        if (extParams.containsKey(MergeUtil.getMergeBlackList())) {
            this.f4274a.addExtParam(MergeUtil.getMergeBlackList(), extParams.get(MergeUtil.getMergeBlackList()));
        }
        this.b = sb2.getBytes().length;
        this.c++;
    }

    public final void d(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104c0a3f", new Object[]{this, behavor});
            return;
        }
        String str = this.f4274a.build().getExtParams().get(MergeUtil.KEY_EXPOSED);
        if (TextUtils.isEmpty(str)) {
            e(behavor);
            return;
        }
        Map<String, String> extParams = behavor.getExtParams();
        if (extParams != null) {
            String b = b(extParams.get(MergeUtil.KEY_RID));
            String c = c(extParams);
            StringBuilder sb = new StringBuilder("");
            if (str.contains(b)) {
                String[] split = str.split("__");
                if (split != null && split.length > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        } else if (split[i].contains(b)) {
                            split[i] = split[i] + c;
                            break;
                        } else {
                            i++;
                        }
                    }
                    for (String str2 : split) {
                        sb.append(str2);
                        sb.append("__");
                    }
                }
            } else {
                sb.append(str);
                sb.append(b);
                sb.append(c);
                sb.append("__");
            }
            String sb2 = sb.toString();
            this.f4274a.addExtParam(MergeUtil.KEY_EXPOSED, sb2);
            if (extParams.containsKey(MergeUtil.getMergeBlackList())) {
                this.f4274a.addExtParam(MergeUtil.getMergeBlackList(), extParams.get(MergeUtil.getMergeBlackList()));
            }
            this.b = sb2.getBytes().length;
            this.c++;
        }
    }
}
