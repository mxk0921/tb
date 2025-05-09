package com.taobao.android.remoteso.tbadapter.biz;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.index.b;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import tb.cgd;
import tb.kgd;
import tb.rbn;
import tb.san;
import tb.trq;
import tb.uec;
import tb.uos;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ABTestIndexHook implements uec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f9287a;
    public final cgd b;
    public final AtomicReference<SoIndexData> c = new AtomicReference<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ABTestBaseInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SoIndexData.SoFileInfo baseInfo;
        public SoIndexData.SoFileInfo compressedLocal;
        public SoIndexData.SoFileInfo compressedRemote;
        public SoIndexData.SoFileInfo diffBase;

        public SoIndexData.SoFileInfo findBase() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("d28ee053", new Object[]{this});
            }
            SoIndexData.SoFileInfo soFileInfo = this.baseInfo;
            if (soFileInfo != null) {
                return soFileInfo;
            }
            SoIndexData.SoFileInfo soFileInfo2 = this.diffBase;
            if (soFileInfo2 != null) {
                return soFileInfo2;
            }
            return null;
        }
    }

    public ABTestIndexHook(kgd kgdVar, cgd cgdVar) {
        this.f9287a = kgdVar;
        this.b = cgdVar;
    }

    @Override // tb.uec
    public void b(List<SoIndexData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0d1a1", new Object[]{this, list});
            return;
        }
        SoIndexData soIndexData = this.c.get();
        if (soIndexData != null) {
            list.add(0, soIndexData);
            RSoLog.d("ABTestIndexHook, hookLastCache(), done, lastIndexList.size = " + list.size());
            return;
        }
        RSoLog.d("ABTestIndexHook, hookLastCache(), do nothing, lastIndexList.size = " + list.size());
    }

    @Override // tb.uec
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa69232", new Object[]{this, soIndexData, soIndexAdvanced});
            return;
        }
        List<String> e = this.b.e("key_abtest_lib_list");
        if (e.isEmpty()) {
            RSoLog.d("ABTestIndexHook, hook(), do nothing, indexData = " + soIndexData + ", indexAdvanced = " + soIndexAdvanced);
            return;
        }
        for (String str : e) {
            RSoLog.d("ABTestIndexHook, hook(), abtestLibName = " + str);
            String d = this.f9287a.d();
            SoInfo2 b = b.b(soIndexAdvanced, str, d);
            if (b == null) {
                RSoLog.g("ABTestIndexHook, hook(), skip, info2 == null");
            } else {
                String str2 = b.advancedInfo;
                if (trq.c(str2)) {
                    RSoLog.g("ABTestIndexHook, hook(), skip, advancedInfo isEmpty");
                } else {
                    try {
                        long b2 = uos.b();
                        ABTestBaseInfo aBTestBaseInfo = (ABTestBaseInfo) JSON.parseObject(str2, ABTestBaseInfo.class);
                        if (aBTestBaseInfo != null) {
                            SoIndexData.SoFileInfo findBase = aBTestBaseInfo.findBase();
                            if (findBase == null) {
                                RSoLog.g("ABTestIndexHook, hook(), skip, abTestBaseInfo == null");
                            } else if (san.a(str, false)) {
                                RSoLog.d("ABTestIndexHook, hook(), ready to do featureOn = true, " + str);
                                SoIndexData soIndexData2 = new SoIndexData();
                                soIndexData2.setAppVersion(soIndexData.getAppVersion());
                                b.a(soIndexData2, str, d, findBase);
                                this.c.set(soIndexData2);
                            } else {
                                RSoLog.d("ABTestIndexHook, hook(), featureOff, " + str);
                                int d2 = b.d(soIndexData, str, d, findBase);
                                if (d2 < 0) {
                                    rbn.e("ABTestIndexHook,featureOff.updateIndex", d2 + " , advancedInfo=" + str2);
                                } else {
                                    b.advancedInfo = null;
                                }
                            }
                        }
                        RSoLog.d("ABTestIndexHook, hook(), done, " + (uos.b() - b2));
                    } catch (Throwable th) {
                        rbn.g("ABTestIndexHook,error", th);
                    }
                }
            }
        }
    }
}
