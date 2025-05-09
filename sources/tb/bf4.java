package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bf4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Comparable<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f16351a;

        static {
            t2o.a(737148979);
        }

        public a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Version can not be null");
            } else if (str.matches("[0-9]+(\\.[0-9]+)*")) {
                this.f16351a = str;
            } else {
                throw new IllegalArgumentException("Invalid version format");
            }
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19f11de7", new Object[]{this, aVar})).intValue();
            }
            if (aVar == null) {
                return 1;
            }
            String[] split = b().split("\\.");
            String[] split2 = aVar.b().split("\\.");
            int max = Math.max(split.length, split2.length);
            for (int i3 = 0; i3 < max; i3++) {
                if (i3 < split.length) {
                    i = Integer.parseInt(split[i3]);
                } else {
                    i = 0;
                }
                if (i3 < split2.length) {
                    i2 = Integer.parseInt(split2[i3]);
                } else {
                    i2 = 0;
                }
                if (i < i2) {
                    return -1;
                }
                if (i > i2) {
                    return 1;
                }
            }
            return 0;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5615b163", new Object[]{this});
            }
            return this.f16351a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && compareTo((a) obj) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(737148978);
    }

    public static boolean a(String str, String str2) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c62e68cf", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || "*".equals(str) || "-".equals(str)) {
            return true;
        }
        try {
            a aVar = new a(str2);
            if (str.contains("|")) {
                try {
                    int indexOf = str.indexOf("|");
                    substring = str.substring(0, indexOf);
                    String substring2 = str.substring(indexOf + 1);
                    String[] split = substring2.split(",");
                    if (split.length > 0) {
                        for (String str3 : split) {
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    if (new a(str3).equals(aVar)) {
                                        return false;
                                    }
                                } catch (IllegalArgumentException unused) {
                                    TLog.loge(yr2.MODULE, "ConditionVerChecker", "checkVersion: check exclude version with IllegalArgumentException, exclude version config is " + substring2);
                                    return false;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    TLog.loge(yr2.MODULE, "ConditionVerChecker", "checkVersion: witch exception " + th.toString() + ", config is " + str + ", curVersion is " + str2);
                    return false;
                }
            } else {
                substring = str;
            }
            if (TextUtils.isEmpty(substring)) {
                return true;
            }
            if (!substring.contains("-")) {
                String[] split2 = substring.split(",");
                if (split2.length < 1) {
                    return false;
                }
                for (String str4 : split2) {
                    try {
                    } catch (IllegalArgumentException unused2) {
                        TLog.loge(yr2.MODULE, "ConditionVerChecker", "checkVersion: check with IllegalArgumentException, version config is " + str + ", cur version is " + str2 + ".");
                    }
                    if (new a(str4).equals(aVar)) {
                        return true;
                    }
                }
            } else {
                String[] split3 = substring.split("-");
                if (substring.endsWith("-") && split3.length == 1) {
                    try {
                        return aVar.compareTo(new a(split3[0])) >= 0;
                    } catch (IllegalArgumentException unused3) {
                        TLog.loge(yr2.MODULE, "ConditionVerChecker", "checkVersion: check with IllegalArgumentException, version config is " + str + ", cur version is " + str2 + ".");
                    }
                } else if (substring.startsWith("-") && split3.length == 2) {
                    try {
                        return aVar.compareTo(new a(split3[1])) <= 0;
                    } catch (IllegalArgumentException unused4) {
                        TLog.loge(yr2.MODULE, "ConditionVerChecker", "checkVersion: check with IllegalArgumentException, version config is " + str + ", cur version is " + str2 + ".");
                    }
                } else if (split3.length == 2) {
                    try {
                        a aVar2 = new a(split3[0]);
                        a aVar3 = new a(split3[1]);
                        if (aVar2.compareTo(aVar3) > 0 || aVar.compareTo(aVar3) > 0) {
                            return false;
                        }
                        return aVar.compareTo(aVar2) >= 0;
                    } catch (IllegalArgumentException unused5) {
                        TLog.loge(yr2.MODULE, "ConditionVerChecker", "checkVersion: check with IllegalArgumentException, version config is " + str + ", cur version is " + str2 + ".");
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException unused6) {
            TLog.loge(yr2.MODULE, "ConditionVerChecker", "checkVersion: init VersionComparable with IllegalArgumentException, current version is " + str2);
            return false;
        }
    }
}
