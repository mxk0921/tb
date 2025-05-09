package com.taobao.android.remoteso.index;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cgd;
import tb.kgd;
import tb.ngd;
import tb.rbn;
import tb.uec;
import tb.uos;
import tb.vox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f9260a;
    public final cgd b;
    public final kgd c;
    public final uec d;
    public SoIndexData e = null;
    public SoIndexAdvanced f = null;
    public RemoPostIndex g = null;
    public final List<SoIndexData.SoFileInfo> h = new CopyOnWriteArrayList();

    public d(Application application, cgd cgdVar, kgd kgdVar, uec uecVar) {
        this.f9260a = application;
        this.b = cgdVar;
        this.c = kgdVar;
        this.d = uecVar;
    }

    public static void b(SoIndexData soIndexData, List<SoIndexData.SoFileInfo> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf970769", new Object[]{soIndexData, list, str});
        } else if (soIndexData != null) {
            for (SoIndexData.SoIndexEntry soIndexEntry : soIndexData.getEntries().values()) {
                SoIndexData.SoFileInfo soFileInfo = soIndexEntry.getFiles().get(str);
                if (soFileInfo != null) {
                    list.add(soFileInfo);
                }
            }
        }
    }

    @Deprecated
    public final void a(SoIndexAdvanced soIndexAdvanced, List<SoIndexData.SoFileInfo> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efadf4f9", new Object[]{this, soIndexAdvanced, list, str});
        } else if (soIndexAdvanced != null) {
            for (Map.Entry<String, SoInfo2> entry : soIndexAdvanced.getInfoMap().entrySet()) {
                if (entry.getKey().endsWith(str)) {
                    list.addAll(j.m(entry.getValue()));
                }
            }
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18b10f97", new Object[]{this, str})).booleanValue();
        }
        if (i().getAssets().containsKey(str)) {
            RSoLog.d("index->containsAssets, found in index.assets , name = " + str);
            return true;
        }
        RemoPostIndex remoPostIndex = this.g;
        if (remoPostIndex == null) {
            RSoLog.b("contains,postIndex==null" + str);
            return false;
        } else if (!remoPostIndex.getAssets().containsKey(str)) {
            return false;
        } else {
            RSoLog.d("index->containsAssets, found in postIndex, name = " + str);
            return true;
        }
    }

    public SoIndexData.SoFileInfo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("f53e9816", new Object[]{this, str});
        }
        SoIndexData.SoFileInfo soFileInfo = i().getAssets().get(str);
        if (soFileInfo != null) {
            RSoLog.d("index->getAssetInfoOrError, found in index.assets , info = " + soFileInfo);
            return soFileInfo;
        }
        RemoPostIndex remoPostIndex = this.g;
        if (remoPostIndex != null) {
            SoIndexData.SoFileInfo soFileInfo2 = remoPostIndex.getAssets().get(str);
            if (soFileInfo2 != null) {
                RSoLog.d("index->getAssetInfoOrError, found in postIndex.assets , infoInPostIndex = " + soFileInfo2);
                return soFileInfo2;
            }
            throw RSoException.error((int) vox.CLASS_2008, "res not found in all place, " + str);
        }
        rbn.e("getInfo,postIndex==null", str);
        throw RSoException.error(2007, "postIndex is empty, rso disabled ?");
    }

    public SoInfo2 e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoInfo2) ipChange.ipc$dispatch("fbe446fc", new Object[]{this, str});
        }
        return j(str, h());
    }

    public SoIndexData.SoFileInfo f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("4b99cedf", new Object[]{this, str});
        }
        return k(str, i());
    }

    public SoIndexData.SoFileInfo g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("b23c1e18", new Object[]{this, str});
        }
        return l(str, i());
    }

    public SoIndexAdvanced h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexAdvanced) ipChange.ipc$dispatch("22c2268d", new Object[]{this});
        }
        SoIndexData soIndexData = this.e;
        if (soIndexData == null) {
            soIndexData = new SoIndexData();
        }
        SoIndexAdvanced soIndexAdvanced = this.f;
        if (soIndexAdvanced == null) {
            soIndexAdvanced = new SoIndexAdvanced();
        }
        this.d.a(soIndexData, soIndexAdvanced);
        return this.f;
    }

    public SoIndexData i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData) ipChange.ipc$dispatch("5c1c25d8", new Object[]{this});
        }
        if (this.e != null) {
            SoIndexAdvanced soIndexAdvanced = this.f;
            if (soIndexAdvanced == null) {
                soIndexAdvanced = new SoIndexAdvanced();
            }
            this.d.a(this.e, soIndexAdvanced);
            return this.e;
        }
        throw RSoException.error(2000, " indexData is empty ,  rso disabled ?");
    }

    public SoInfo2 j(String str, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoInfo2) ipChange.ipc$dispatch("61e22e17", new Object[]{this, str, soIndexAdvanced});
        }
        if (soIndexAdvanced == null) {
            RSoLog.d(" index2 ->  index2Data is null , libName=" + str);
            return null;
        }
        String d = this.c.d();
        try {
            Map<String, SoInfo2> infoMap = soIndexAdvanced.getInfoMap();
            return infoMap.get(str + "|" + d);
        } catch (Throwable unused) {
            rbn.e("index,getInfo2OrNull", "index2 ->  getAvailableInfo2");
            return null;
        }
    }

    public SoIndexData.SoFileInfo k(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("2587909e", new Object[]{this, str, soIndexData});
        }
        String d = this.c.d();
        if (soIndexData != null) {
            SoIndexData.SoIndexEntry soIndexEntry = soIndexData.getEntries().get(str);
            if (soIndexEntry != null) {
                SoIndexData.SoFileInfo soFileInfo = soIndexEntry.getFiles().get(d);
                if (soFileInfo != null) {
                    a.a(soFileInfo);
                    return soFileInfo;
                }
                throw RSoException.error(2010, "info == null, no info found by libName=" + str + ", entry=" + soIndexEntry + ", abi=" + d);
            }
            throw RSoException.error(2001, "entry == null, no entry found by libName=" + str + ", data = " + soIndexData);
        }
        throw RSoException.error(2000, " indexData is empty , wtf ? abi = " + d);
    }

    public SoIndexData.SoFileInfo l(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("c0a8500b", new Object[]{this, str, soIndexData});
        }
        try {
            return k(str, soIndexData);
        } catch (Throwable unused) {
            RSoLog.d("index-> getInfoOrNull got error" + str);
            return null;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f35492d2", new Object[]{this});
            return;
        }
        try {
            long b = uos.b();
            RSoLog.d("initSync, enter");
            this.e = (SoIndexData) a.b(this.f9260a, this.b, "swallows_rso_index", SoIndexData.class);
            RSoLog.d("initSync, initIndex -> " + this.e);
            long b2 = uos.b();
            long b3 = uos.b();
            this.f = (SoIndexAdvanced) a.b(this.f9260a, this.b, "swallows_rso_index2", SoIndexAdvanced.class);
            RSoLog.d("initSync, initIndex2 -> " + this.f);
            long b4 = uos.b();
            this.g = (RemoPostIndex) a.b(this.f9260a, this.b, "swallows_remo_post_index", RemoPostIndex.class);
            RSoLog.d("initSync, postIndex -> " + this.g);
            s(b, b2, b3, b4);
        } catch (Throwable th) {
            rbn.g("RSoIndexManager,initSync", th);
        }
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec50b320", new Object[]{this});
        }
        String d = this.c.d();
        SoIndexAdvanced h = h();
        if (h == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, SoInfo2> entry : h.getInfoMap().entrySet()) {
            if (entry.getKey().endsWith(d)) {
                sb.append(entry.getValue().advancedInfo);
            }
        }
        return sb.toString();
    }

    public Collection<SoIndexData.SoFileInfo> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("ddd2e9b4", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String d = this.c.d();
        b(i(), arrayList, d);
        RSoLog.d("index-> listInfo, after addInfoFromData, results.size = " + arrayList.size());
        a(h(), arrayList, d);
        RSoLog.d("index-> listInfo, after addInfoFromAdvanced, results.size = " + arrayList.size());
        arrayList.addAll(this.h);
        RSoLog.d("index-> listInfo, after availableInfoList, results.size = " + arrayList.size());
        arrayList.addAll(i().getAssets().values());
        RSoLog.d("index-> listInfo, after assets, results.size = " + arrayList.size());
        RemoPostIndex remoPostIndex = this.g;
        if (remoPostIndex != null) {
            arrayList.addAll(remoPostIndex.getAssets().values());
            RSoLog.d("index-> listInfo, after postIndex, results.size = " + arrayList.size());
        }
        return arrayList;
    }

    public Collection<String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("43617eae", new Object[]{this});
        }
        return i().getEntries().keySet();
    }

    public List<RemoConfig> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b5292cb", new Object[]{this});
        }
        List<RemoConfig> c = a.c(this.c.getApp(), this.b, "swallows_remo_config", RemoConfig.class);
        return c != null ? c : Collections.emptyList();
    }

    public void r(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0eca41", new Object[]{this, soIndexData, soIndexAdvanced});
            return;
        }
        String d = this.c.d();
        ArrayList arrayList = new ArrayList();
        b(soIndexData, arrayList, d);
        a(soIndexAdvanced, arrayList, d);
        ((CopyOnWriteArrayList) this.h).addAll(arrayList);
    }

    public final void s(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13937c02", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("parseIndexCost", Long.valueOf(j2 - j));
        hashMap.put("parseLastIndexCost", Long.valueOf(j3 - j2));
        hashMap.put("parseAdvancedIndexCost", Long.valueOf(j4 - j3));
        hashMap.put(ngd.ARGS_INDEX_INIT_INDEX_TOTAL, Long.valueOf(uos.b() - j));
        hashMap.put("args_last_major_app_version", this.c.e());
        hashMap.put("packageName", this.c.getApp().getPackageName());
        rbn.d(ngd.POINT_INDEX, hashMap);
    }
}
