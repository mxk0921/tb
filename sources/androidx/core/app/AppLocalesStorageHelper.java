package androidx.core.app;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppLocalesStorageHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPLICATION_LOCALES_RECORD_FILE = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";
    public static final boolean DEBUG = false;
    public static final String LOCALE_RECORD_ATTRIBUTE_TAG = "application_locales";
    public static final String LOCALE_RECORD_FILE_TAG = "locales";
    public static final String TAG = "AppLocalesStorageHelper";
    private static final Object sAppLocaleStorageSync = new Object();

    private AppLocalesStorageHelper() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r5 != null) goto L_0x0055;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void persistLocales(android.content.Context r5, java.lang.String r6) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.core.app.AppLocalesStorageHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "e7a98926"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r5 = 1
            r3[r5] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0016:
            java.lang.Object r1 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r1)
            java.lang.String r2 = ""
            boolean r2 = r6.equals(r2)     // Catch: all -> 0x0028
            if (r2 == 0) goto L_0x002a
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: all -> 0x0028
            monitor-exit(r1)     // Catch: all -> 0x0028
            return
        L_0x0028:
            r5 = move-exception
            goto L_0x006a
        L_0x002a:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r0)     // Catch: all -> 0x0028, FileNotFoundException -> 0x0068
            org.xmlpull.v1.XmlSerializer r0 = android.util.Xml.newSerializer()     // Catch: all -> 0x0028
            r2 = 0
            r0.setOutput(r5, r2)     // Catch: all -> 0x0059, Exception -> 0x005b
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: all -> 0x0059, Exception -> 0x005b
            r0.startDocument(r3, r4)     // Catch: all -> 0x0059, Exception -> 0x005b
            java.lang.String r3 = "locales"
            r0.startTag(r2, r3)     // Catch: all -> 0x0059, Exception -> 0x005b
            java.lang.String r3 = "application_locales"
            r0.attribute(r2, r3, r6)     // Catch: all -> 0x0059, Exception -> 0x005b
            java.lang.String r6 = "locales"
            r0.endTag(r2, r6)     // Catch: all -> 0x0059, Exception -> 0x005b
            r0.endDocument()     // Catch: all -> 0x0059, Exception -> 0x005b
            if (r5 == 0) goto L_0x0066
        L_0x0055:
            r5.close()     // Catch: all -> 0x0028, IOException -> 0x0066
            goto L_0x0066
        L_0x0059:
            r6 = move-exception
            goto L_0x005d
        L_0x005b:
            goto L_0x0063
        L_0x005d:
            if (r5 == 0) goto L_0x0062
            r5.close()     // Catch: all -> 0x0028, IOException -> 0x0062
        L_0x0062:
            throw r6     // Catch: all -> 0x0028
        L_0x0063:
            if (r5 == 0) goto L_0x0066
            goto L_0x0055
        L_0x0066:
            monitor-exit(r1)     // Catch: all -> 0x0028
            return
        L_0x0068:
            monitor-exit(r1)     // Catch: all -> 0x0028
            return
        L_0x006a:
            monitor-exit(r1)     // Catch: all -> 0x0028
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AppLocalesStorageHelper.persistLocales(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r6 != 4) goto L_0x0047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r4.getName().equals(androidx.core.app.AppLocalesStorageHelper.LOCALE_RECORD_FILE_TAG) == false) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        r2 = r4.getAttributeValue(null, androidx.core.app.AppLocalesStorageHelper.LOCALE_RECORD_ATTRIBUTE_TAG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r3 != null) goto L_0x005d;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073 A[Catch: all -> 0x0061, TryCatch #6 {, blocks: (B:9:0x001a, B:27:0x005d, B:31:0x006c, B:34:0x0073, B:35:0x0078, B:37:0x007a, B:10:0x0020, B:11:0x002d, B:15:0x0036, B:23:0x0047, B:25:0x0054), top: B:44:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readLocales(android.content.Context r9) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.core.app.AppLocalesStorageHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "29d3ef42"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r9
            java.lang.Object r9 = r1.ipc$dispatch(r2, r0)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L_0x0015:
            java.lang.Object r1 = androidx.core.app.AppLocalesStorageHelper.sAppLocaleStorageSync
            monitor-enter(r1)
            java.lang.String r2 = ""
            java.lang.String r3 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r3 = r9.openFileInput(r3)     // Catch: all -> 0x0061, FileNotFoundException -> 0x007a
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
            int r5 = r4.getDepth()     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
        L_0x002d:
            int r6 = r4.next()     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
            if (r6 == r0) goto L_0x005b
            r7 = 3
            if (r6 != r7) goto L_0x0041
            int r8 = r4.getDepth()     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
            if (r8 <= r5) goto L_0x005b
            goto L_0x0041
        L_0x003d:
            r9 = move-exception
            goto L_0x0063
        L_0x003f:
            goto L_0x0069
        L_0x0041:
            if (r6 == r7) goto L_0x002d
            r7 = 4
            if (r6 != r7) goto L_0x0047
            goto L_0x002d
        L_0x0047:
            java.lang.String r6 = r4.getName()     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
            if (r6 == 0) goto L_0x002d
            java.lang.String r0 = "application_locales"
            r5 = 0
            java.lang.String r2 = r4.getAttributeValue(r5, r0)     // Catch: all -> 0x003d, XmlPullParserException | IOException -> 0x003f
        L_0x005b:
            if (r3 == 0) goto L_0x006c
        L_0x005d:
            r3.close()     // Catch: all -> 0x0061, IOException -> 0x006c
            goto L_0x006c
        L_0x0061:
            r9 = move-exception
            goto L_0x007c
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            r3.close()     // Catch: all -> 0x0061, IOException -> 0x0068
        L_0x0068:
            throw r9     // Catch: all -> 0x0061
        L_0x0069:
            if (r3 == 0) goto L_0x006c
            goto L_0x005d
        L_0x006c:
            boolean r0 = r2.isEmpty()     // Catch: all -> 0x0061
            if (r0 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r9.deleteFile(r0)     // Catch: all -> 0x0061
        L_0x0078:
            monitor-exit(r1)     // Catch: all -> 0x0061
            return r2
        L_0x007a:
            monitor-exit(r1)     // Catch: all -> 0x0061
            return r2
        L_0x007c:
            monitor-exit(r1)     // Catch: all -> 0x0061
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AppLocalesStorageHelper.readLocales(android.content.Context):java.lang.String");
    }
}
