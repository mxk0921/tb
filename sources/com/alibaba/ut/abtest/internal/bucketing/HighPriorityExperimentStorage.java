package com.alibaba.ut.abtest.internal.bucketing;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a1;
import tb.bqm;
import tb.mwa;
import tb.n;
import tb.pv6;
import tb.t2o;
import tb.uwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HighPriorityExperimentStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OPT_VERSION = 1;
    public static final String OPT_VERSION_KEY = "OPT_VERSION";
    public static final String SP_NAME_BETA_SINGLE = "ut_ab_lazy_exp_beta_single";
    public static final String SP_NAME_PULL_BETA_FILE = "ut_ab_lazy_exp_pull_beta_file";
    public static final String SP_NAME_RELEASE = "ut_ab_lazy_exp_release";
    public static final int STORE_TYPE_CONFIG_AND_RESULT = 2;
    public static final int STORE_TYPE_CONFIG_ONLY = 1;
    public static final List<String> g;

    /* renamed from: a  reason: collision with root package name */
    public String f3378a;
    public Collection<ExperimentV5> b;
    public long e;
    public boolean c = true;
    public int d = 1;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface StoreType {
    }

    public HighPriorityExperimentStorage a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("af80af53", new Object[]{this});
        }
        this.f = true;
        return this;
    }

    public final void b(SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9f1be", new Object[]{this, editor});
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (ExperimentV5 experimentV5 : this.b) {
            if (experimentV5 != null && experimentV5.isHighPriorityWork()) {
                editor.putString("expKey_" + experimentV5.getKey(), uwf.d(experimentV5).replace("\"", "'"));
                sb.append(experimentV5.getKey());
                sb.append("###");
                for (String str : experimentV5.getSwitchSet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = (String) hashMap2.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            hashMap2.put(str, experimentV5.getKey());
                        } else {
                            hashMap2.put(str, str2 + "###" + experimentV5.getKey());
                        }
                        sb2.append(str);
                        sb2.append("###");
                    }
                }
                if (experimentV5.isRetain()) {
                    String str3 = (String) hashMap.get(Long.valueOf(experimentV5.getLayerId()));
                    if (TextUtils.isEmpty(str3)) {
                        hashMap.put(Long.valueOf(experimentV5.getLayerId()), experimentV5.getKey());
                    } else {
                        Long valueOf = Long.valueOf(experimentV5.getLayerId());
                        hashMap.put(valueOf, str3 + "###" + experimentV5.getKey());
                    }
                    sb3.append(experimentV5.getLayerId());
                    sb3.append("###");
                }
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                editor.putString("switchName_" + ((String) entry.getKey()), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            editor.putString("layerId_" + entry2.getKey(), (String) entry2.getValue());
        }
        editor.putString(g(), sb.toString());
        editor.putString(h(), sb2.toString());
        editor.putString(f(), sb3.toString());
    }

    public final void d(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16af36a4", new Object[]{this, sharedPreferences, editor});
            return;
        }
        String string = sharedPreferences.getString(g(), "");
        if (string != null) {
            strArr = string.split("###");
        } else {
            strArr = new String[0];
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                editor.remove("expKey_" + str);
            }
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9670e0c7", new Object[]{this});
        }
        String str = this.f3378a;
        str.hashCode();
        if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            return "allBetaLazyLoadSingleEmptyLayerIds";
        }
        if (!str.equals("beta")) {
            return "allLazyLoadEmptyLayerIds";
        }
        if (this.c) {
            return "allBetaLazyLoadPercentEmptyLayerIds";
        }
        return "allBetaLazyLoadEmptyLayerIds";
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20e58ac9", new Object[]{this});
        }
        String str = this.f3378a;
        str.hashCode();
        if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            return "allBetaLazyLoadSingleExpKeys";
        }
        if (!str.equals("beta")) {
            return "allLazyLoadExpKeys";
        }
        if (this.c) {
            return "allBetaLazyLoadPercentExpKeys";
        }
        return "allBetaLazyLoadExpKeys";
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ab6c72", new Object[]{this});
        }
        String str = this.f3378a;
        str.hashCode();
        if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            return "allBetaLazyLoadSingleSwitchNames";
        }
        if (!str.equals("beta")) {
            return "allLazyLoadSwitchNames";
        }
        if (this.c) {
            return "allBetaLazyLoadPercentSwitchNames";
        }
        return "allBetaLazyLoadSwitchNames";
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c340148", new Object[]{this});
        }
        String str = this.f3378a;
        str.hashCode();
        if (str.equals(EvoAccsService.ACCS_BETA_SINGLE)) {
            return SP_NAME_BETA_SINGLE;
        }
        if (!str.equals("beta")) {
            return SP_NAME_RELEASE;
        }
        return SP_NAME_PULL_BETA_FILE;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337826b7", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = n.j().b().getSharedPreferences(i(), 0).edit();
        if (!this.f) {
            edit.clear();
        }
        for (ExperimentV5 experimentV5 : this.b) {
            if (experimentV5.getCognation() == null || experimentV5.getCognation().getRoutingType() != ExperimentRoutingType.UserId) {
                String[] e = a1.e(experimentV5.getKey());
                if (e != null && !TextUtils.equals(UTABTest.COMPONENT_URI, e[0])) {
                    mwa mwaVar = new mwa(experimentV5, n.j().e().m(experimentV5, null, new pv6(), true));
                    if (mwaVar.p()) {
                        edit.putString(experimentV5.getKey(), mwaVar.t());
                    }
                }
            }
        }
        if (!this.f) {
            edit.putLong("experimentDataVersionV5", this.e);
        }
        edit.putInt(OPT_VERSION_KEY, 1);
        edit.commit();
    }

    public HighPriorityExperimentStorage k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("d2c8fcc0", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !((ArrayList) g).contains(str)) {
            throw new RuntimeException("Not support file type!");
        }
        this.f3378a = str;
        return this;
    }

    public HighPriorityExperimentStorage l(Collection<ExperimentV5> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("9f1dba83", new Object[]{this, collection});
        }
        this.b = collection;
        return this;
    }

    public HighPriorityExperimentStorage m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("3529dfe6", new Object[]{this, new Integer(i)});
        }
        this.d = i;
        return this;
    }

    public HighPriorityExperimentStorage n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("2bd3adcb", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public HighPriorityExperimentStorage o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HighPriorityExperimentStorage) ipChange.ipc$dispatch("369f3e22", new Object[]{this, new Long(j)});
        }
        this.e = j;
        return this;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57828eb4", new Object[]{this});
        } else if (this.c || !EvoAccsService.ACCS_BETA_SINGLE.equals(this.f3378a)) {
            SharedPreferences c = bqm.a().c();
            SharedPreferences.Editor edit = c.edit();
            if (!this.f) {
                d(c, edit);
                e(c, edit);
                c(c, edit);
            }
            b(edit);
            edit.apply();
            if (this.d == 2) {
                j();
            }
        }
    }

    public final void c(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe889bb3", new Object[]{this, sharedPreferences, editor});
            return;
        }
        String string = sharedPreferences.getString(f(), "");
        if (string != null) {
            strArr = string.split("###");
        } else {
            strArr = new String[0];
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                editor.remove("layerId_" + str);
            }
        }
    }

    public final void e(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4dcd91e", new Object[]{this, sharedPreferences, editor});
            return;
        }
        String string = sharedPreferences.getString(h(), "");
        if (string != null) {
            strArr = string.split("###");
        } else {
            strArr = new String[0];
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                editor.remove("switchName_" + str);
            }
        }
    }

    static {
        t2o.a(961544331);
        ArrayList arrayList = new ArrayList();
        g = arrayList;
        arrayList.add("release");
        arrayList.add("beta");
        arrayList.add(EvoAccsService.ACCS_BETA_SINGLE);
    }
}
