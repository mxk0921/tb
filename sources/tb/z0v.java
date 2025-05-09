package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mExpName = null;
        public String mMd5 = null;
        public String mCrashDetail = null;
        public boolean mCrashedByUT = false;

        static {
            t2o.a(962593275);
        }

        public String getCrashDetail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5ad25297", new Object[]{this});
            }
            return this.mCrashDetail;
        }

        public String getExpName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1fe1b027", new Object[]{this});
            }
            return this.mExpName;
        }

        public String getMd5() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
            }
            return this.mMd5;
        }

        public boolean isCrashedByUT() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f1468dd", new Object[]{this})).booleanValue();
            }
            return this.mCrashedByUT;
        }

        public void setCrashDetail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("172f2f27", new Object[]{this, str});
            } else {
                this.mCrashDetail = str;
            }
        }

        public void setExpName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e357dd97", new Object[]{this, str});
            } else {
                this.mExpName = str;
            }
        }

        public void setMd5(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
            } else {
                this.mMd5 = str;
            }
        }

        public void setmCrashedByUT(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23aec63c", new Object[]{this, new Boolean(z)});
            } else {
                this.mCrashedByUT = z;
            }
        }
    }

    static {
        t2o.a(962593274);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.z0v.a parse(java.lang.Throwable r6) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.z0v.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "995f9832"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r1)
            tb.z0v$a r6 = (tb.z0v.a) r6
            return r6
        L_0x0015:
            if (r6 == 0) goto L_0x00bd
            tb.z0v$a r2 = new tb.z0v$a
            r2.<init>()
            java.lang.Throwable r3 = r6.getCause()
            if (r3 != 0) goto L_0x0023
            r3 = r6
        L_0x0023:
            java.lang.StackTraceElement[] r4 = r3.getStackTrace()
            int r5 = r4.length
            if (r5 <= 0) goto L_0x00bc
            r4 = r4[r0]
            if (r4 == 0) goto L_0x00bc
            java.lang.String r3 = r3.toString()
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            r6.printStackTrace(r5)     // Catch: all -> 0x004c, Exception -> 0x0054
            java.lang.String r6 = r4.toString()     // Catch: all -> 0x004c, Exception -> 0x0054
            r5.close()     // Catch: Exception -> 0x004a
            r4.close()     // Catch: Exception -> 0x004a
            goto L_0x005c
        L_0x004a:
            goto L_0x005c
        L_0x004c:
            r6 = move-exception
            r5.close()     // Catch: Exception -> 0x0053
            r4.close()     // Catch: Exception -> 0x0053
        L_0x0053:
            throw r6
        L_0x0054:
            r5.close()     // Catch: Exception -> 0x005a
            r4.close()     // Catch: Exception -> 0x005a
        L_0x005a:
            java.lang.String r6 = ""
        L_0x005c:
            java.lang.String r4 = "}:"
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x0070
            int r4 = r4 + 2
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = r3.trim()
            goto L_0x007c
        L_0x0070:
            java.lang.String r4 = ":"
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x007c
            java.lang.String r3 = r3.substring(r0, r4)
        L_0x007c:
            r2.setExpName(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x008d
            java.lang.String r3 = "\n"
            java.lang.String r4 = "++"
            java.lang.String r6 = r6.replaceAll(r3, r4)
        L_0x008d:
            r2.setCrashDetail(r6)
            byte[] r3 = r6.getBytes()
            java.lang.String r3 = tb.qoh.b(r3)
            r2.setMd5(r3)
            java.lang.String r3 = "com.taobao.statistic"
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x00b9
            java.lang.String r3 = "com.ut"
            boolean r3 = r6.contains(r3)
            if (r3 != 0) goto L_0x00b9
            java.lang.String r3 = "org.usertrack"
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            r2.setmCrashedByUT(r0)
            goto L_0x00bc
        L_0x00b9:
            r2.setmCrashedByUT(r1)
        L_0x00bc:
            return r2
        L_0x00bd:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.z0v.parse(java.lang.Throwable):tb.z0v$a");
    }
}
