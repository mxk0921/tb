package com.alipay.mobile.common.logging.helper;

import android.content.Context;
import com.alipay.mobile.common.logging.api.DeviceHWInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import tb.vox;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class YearClass {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Integer f3972a;

    public static int a(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (f3972a == null) {
            synchronized (YearClass.class) {
                try {
                    if (f3972a == null) {
                        long totalMemory = DeviceHWInfo.getTotalMemory(context);
                        if (totalMemory == -1) {
                            ArrayList arrayList = new ArrayList();
                            int numberOfCPUCores = DeviceHWInfo.getNumberOfCPUCores();
                            if (numberOfCPUCores <= 0) {
                                i2 = -1;
                            } else if (numberOfCPUCores == 1) {
                                i2 = vox.CLASS_2008;
                            } else if (numberOfCPUCores <= 3) {
                                i2 = vox.CLASS_2011;
                            } else {
                                i2 = vox.CLASS_2012;
                            }
                            b(arrayList, i2);
                            long cPUMaxFreqKHz = DeviceHWInfo.getCPUMaxFreqKHz();
                            if (cPUMaxFreqKHz == -1) {
                                i3 = -1;
                            } else if (cPUMaxFreqKHz <= 528000) {
                                i3 = vox.CLASS_2008;
                            } else if (cPUMaxFreqKHz <= 620000) {
                                i3 = vox.CLASS_2009;
                            } else if (cPUMaxFreqKHz <= 1020000) {
                                i3 = 2010;
                            } else if (cPUMaxFreqKHz <= 1220000) {
                                i3 = vox.CLASS_2011;
                            } else if (cPUMaxFreqKHz <= 1520000) {
                                i3 = vox.CLASS_2012;
                            } else if (cPUMaxFreqKHz <= 2020000) {
                                i3 = 2013;
                            } else {
                                i3 = 2014;
                            }
                            b(arrayList, i3);
                            long totalMemory2 = DeviceHWInfo.getTotalMemory(context);
                            if (totalMemory2 <= 0) {
                                i4 = -1;
                            } else if (totalMemory2 <= 201326592) {
                                i4 = vox.CLASS_2008;
                            } else if (totalMemory2 <= 304087040) {
                                i4 = vox.CLASS_2009;
                            } else if (totalMemory2 <= 536870912) {
                                i4 = 2010;
                            } else if (totalMemory2 <= 1073741824) {
                                i4 = vox.CLASS_2011;
                            } else if (totalMemory2 <= 1610612736) {
                                i4 = vox.CLASS_2012;
                            } else if (totalMemory2 <= 2147483648L) {
                                i4 = 2013;
                            } else {
                                i4 = 2014;
                            }
                            b(arrayList, i4);
                            if (arrayList.isEmpty()) {
                                i = -1;
                            } else {
                                Collections.sort(arrayList);
                                if ((arrayList.size() & 1) == 1) {
                                    i = ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
                                } else {
                                    int size = arrayList.size() / 2;
                                    int i5 = size - 1;
                                    i = ((Integer) arrayList.get(i5)).intValue() + ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i5)).intValue()) / 2);
                                }
                            }
                        } else if (totalMemory <= 805306368) {
                            if (DeviceHWInfo.getNumberOfCPUCores() <= 1) {
                                i = vox.CLASS_2009;
                            } else {
                                i = 2010;
                            }
                        } else if (totalMemory <= 1073741824) {
                            if (DeviceHWInfo.getCPUMaxFreqKHz() < 1300000) {
                                i = vox.CLASS_2011;
                            }
                            i = vox.CLASS_2012;
                        } else {
                            if (totalMemory <= 1610612736) {
                                if (DeviceHWInfo.getCPUMaxFreqKHz() < 1800000) {
                                    i = vox.CLASS_2012;
                                }
                            } else if (totalMemory > 2147483648L) {
                                if (totalMemory <= 3221225472L) {
                                    i = 2014;
                                } else {
                                    i = LogContext.PERFORMANCE_SCORE_ENDURE_2015;
                                }
                            }
                            i = 2013;
                        }
                        f3972a = Integer.valueOf(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3972a.intValue();
    }

    public static void b(ArrayList<Integer> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1640bd01", new Object[]{arrayList, new Integer(i)});
        } else if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }
}
