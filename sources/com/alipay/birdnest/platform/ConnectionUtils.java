package com.alipay.birdnest.platform;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.alipay.birdnest.util.FBLabelSpanUtil$ClickMoreListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBLabel;
import com.flybird.FBView;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.FBTemplateStorage$StorageType;
import com.flybird.deploy.model.FBSimpleTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.support.basics.KVStorage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import tb.jst;
import tb.k8u;
import tb.l2w;
import tb.pgh;
import tb.td9;
import tb.tu8;
import tb.uca;
import tb.zta;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ConnectionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(File file, File file2) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3abf716", new Object[]{file, file2});
        } else if (!file.isFile()) {
            throw new RuntimeException("zip file not exists: " + file);
        } else if (file2.exists()) {
            throw new RuntimeException("destDir exists: " + file2);
        } else if (file2.mkdirs()) {
            byte[] bArr = new byte[1024];
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    String name = nextEntry.getName();
                    if (!nextEntry.isDirectory() && name != null && !name.contains("../")) {
                        File file3 = new File(file2 + File.separator + name);
                        new File(file3.getParent()).mkdirs();
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                    }
                    zipInputStream.closeEntry();
                }
                zipInputStream.closeEntry();
                zipInputStream.close();
                fileInputStream.close();
                try {
                    new File(file2, ".__done__").createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException("failed to create __done__ file", e);
                }
            } catch (IOException e2) {
                throw new RuntimeException("failed to unzip file", e2);
            }
        } else {
            throw new RuntimeException("mkdir failed: " + file2);
        }
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        try {
            return new String(bArr, "utf-8");
        } catch (Throwable th) {
            pgh.m(th, "decode utf-8 error");
            return null;
        }
    }

    public static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f6d5d94c", new Object[]{bArr});
        }
        jst.a();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byte[] bArr2 = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = gZIPInputStream.read(bArr2, 0, 4096);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            pgh.m(th, "ungzip error");
            return null;
        }
    }

    public static JSONObject d(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("df1cfc63", new Object[]{str});
        }
        try {
            return new JSONObject(str);
        } catch (Throwable th) {
            pgh.m(th, "toJson error");
            return null;
        }
    }

    public static synchronized File e(String str, String str2) throws Exception {
        boolean z = false;
        synchronized (ConnectionUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("3334fb8d", new Object[]{str, str2});
            }
            String a2 = a(str, str2, FBTemplateStorage$StorageType.DEFAULT);
            String b = b(a2);
            File d = td9.d("fb__tpl_storage/pack", a2, true);
            if (d != null) {
                File n = td9.n("fb__tpl_storage/pack", b);
                if (n.exists() && n.isDirectory()) {
                    z = new File(n, ".__done__").exists();
                }
                return d;
            }
            return null;
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (str == null || str2 == null || str.length() == 0 || str2.length() == 0) {
            return null;
        }
        return str + "@" + str2;
    }

    public static File d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("19197cee", new Object[]{str, str2});
        }
        if (!AppContextHolder.b) {
            pgh.p("not supported");
        }
        pgh.h("getFileFromOverrideZip called on " + str + ":" + str2);
        return new File(td9.j(str), str2);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        return str + "_extracted";
    }

    public static k8u c(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k8u) ipChange.ipc$dispatch("40310586", new Object[]{str});
        }
        k8u k8uVar = new k8u();
        if (str != null) {
            int indexOf = str.indexOf(64);
            int lastIndexOf = str.substring(0, indexOf == -1 ? str.length() : indexOf).lastIndexOf(47);
            if (lastIndexOf != -1 && indexOf != -1) {
                str3 = str.substring(0, lastIndexOf);
                str2 = str.substring(lastIndexOf + 1, indexOf);
                str = str.substring(indexOf + 1);
            } else if (lastIndexOf != -1) {
                str3 = str.substring(0, lastIndexOf);
                str = str.substring(lastIndexOf + 1);
                str2 = "";
            } else if (indexOf != -1) {
                str2 = str.substring(0, indexOf);
                str = str.substring(indexOf + 1);
                str3 = "";
            } else {
                str3 = "";
                str2 = str3;
            }
            String str4 = null;
            if (str3.length() <= 0) {
                str3 = null;
            }
            k8uVar.f22480a = str3;
            k8uVar.b = str2.length() > 0 ? str2 : null;
            if (str.length() > 0) {
                str4 = str;
            }
            k8uVar.c = str4;
            if (str2.length() > 0 && str.length() > 0) {
                b(str2, str);
            }
        }
        return k8uVar;
    }

    public static void a(final TextView textView, final String str, final SpannableStringBuilder spannableStringBuilder, final FBLabelSpanUtil$ClickMoreListener fBLabelSpanUtil$ClickMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3518ef71", new Object[]{textView, str, spannableStringBuilder, fBLabelSpanUtil$ClickMoreListener});
        } else if (TextUtils.isEmpty(textView.getText())) {
            pgh.e("FBLabelSpanUtil", "textView:" + ((Object) textView.getText()));
        } else {
            pgh.i("FBLabelSpanUtil", "toggleEllipsize textView:" + textView);
            try {
                textView.getContext();
                IpChange ipChange2 = Platform.$ipChange;
            } catch (Exception unused) {
            }
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: tb.yi4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return ConnectionUtils.a(textView, view, motionEvent);
                }
            });
            final ClickableSpan fBLabelSpanUtil$1 = new ClickableSpan() { // from class: com.alipay.birdnest.util.FBLabelSpanUtil$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(FBLabelSpanUtil$1 fBLabelSpanUtil$12, String str2, Object... objArr) {
                    if (str2.hashCode() == -1038128277) {
                        super.updateDrawState((TextPaint) objArr[0]);
                        return null;
                    }
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/birdnest/util/FBLabelSpanUtil$1");
                }

                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    IpChange ipChange3 = $ipChange;
                    if (ipChange3 instanceof IpChange) {
                        ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    FBLabel fBLabel = (FBLabel) FBLabelSpanUtil$ClickMoreListener.this;
                    if (!fBLabel.isDestroyed()) {
                        FBView.nativePlatformOnMoreClick(fBLabel.mNode);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    IpChange ipChange3 = $ipChange;
                    if (ipChange3 instanceof IpChange) {
                        ipChange3.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(Color.parseColor("#1677ff"));
                }
            };
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(textView, spannableStringBuilder, str, "...", "全部", fBLabelSpanUtil$1) { // from class: com.alipay.birdnest.util.FBLabelSpanUtil$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ TextView f3831a;
                public final /* synthetic */ SpannableStringBuilder b;
                public final /* synthetic */ String c;
                public final /* synthetic */ ClickableSpan d;

                {
                    this.d = fBLabelSpanUtil$1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
                    if (r13 == r8) goto L_0x0110;
                 */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onGlobalLayout() {
                    /*
                        Method dump skipped, instructions count: 454
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.util.FBLabelSpanUtil$2.onGlobalLayout():void");
                }
            });
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{str, str2});
        }
        return "js__" + l2w.b(str, "") + "__" + l2w.b(str2, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r4) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.birdnest.platform.ConnectionUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "bbc5dc40"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r2, r0)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            java.lang.String r1 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: Exception -> 0x004e
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: Exception -> 0x004e
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch: Exception -> 0x004e
            if (r4 == 0) goto L_0x004e
            boolean r1 = r4.isConnected()     // Catch: Exception -> 0x004e
            r2 = 6
            if (r1 != 0) goto L_0x002c
            r0 = 6
            goto L_0x004f
        L_0x002c:
            int r1 = r4.getType()     // Catch: Exception -> 0x004e
            if (r1 == 0) goto L_0x0040
            r3 = 5
            if (r1 == r0) goto L_0x003e
            if (r1 == r3) goto L_0x0040
            if (r1 == r2) goto L_0x003e
            r4 = 9
            if (r1 == r4) goto L_0x003e
            goto L_0x004e
        L_0x003e:
            r0 = 5
            goto L_0x004f
        L_0x0040:
            int r4 = r4.getSubtype()     // Catch: Exception -> 0x004e
            switch(r4) {
                case 1: goto L_0x004f;
                case 2: goto L_0x004f;
                case 3: goto L_0x004c;
                case 4: goto L_0x004f;
                case 5: goto L_0x004c;
                case 6: goto L_0x004c;
                case 7: goto L_0x004f;
                case 8: goto L_0x004c;
                case 9: goto L_0x004c;
                case 10: goto L_0x004c;
                case 11: goto L_0x004f;
                case 12: goto L_0x004c;
                case 13: goto L_0x004a;
                case 14: goto L_0x004c;
                case 15: goto L_0x004c;
                case 16: goto L_0x004f;
                case 17: goto L_0x004c;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x004e
        L_0x0048:
            r0 = 4
            goto L_0x004f
        L_0x004a:
            r0 = 3
            goto L_0x004f
        L_0x004c:
            r0 = 2
            goto L_0x004f
        L_0x004e:
            r0 = 7
        L_0x004f:
            switch(r0) {
                case 1: goto L_0x0064;
                case 2: goto L_0x0061;
                case 3: goto L_0x005e;
                case 4: goto L_0x005b;
                case 5: goto L_0x0058;
                case 6: goto L_0x0055;
                default: goto L_0x0052;
            }
        L_0x0052:
            java.lang.String r4 = "INVALID"
            return r4
        L_0x0055:
            java.lang.String r4 = "NO"
            return r4
        L_0x0058:
            java.lang.String r4 = "WIFI"
            return r4
        L_0x005b:
            java.lang.String r4 = "5G"
            return r4
        L_0x005e:
            java.lang.String r4 = "4G"
            return r4
        L_0x0061:
            java.lang.String r4 = "3G"
            return r4
        L_0x0064:
            java.lang.String r4 = "2G"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.platform.ConnectionUtils.a(android.content.Context):java.lang.String");
    }

    public static /* synthetic */ boolean a(TextView textView, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a091270f", new Object[]{textView, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 1) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            if (((ClickableSpan[]) new SpannableString(textView.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)).length != 0) {
                return false;
            }
            textView.performClick();
        }
        return true;
    }

    public static synchronized void a(FBTemplateDecider fBTemplateDecider, FBTemplateContent fBTemplateContent, int i) throws Exception {
        synchronized (ConnectionUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58d56080", new Object[]{fBTemplateDecider, fBTemplateContent, new Integer(i)});
                return;
            }
            FBTemplateStorage$StorageType a2 = a(i);
            tu8 m = FBTemplateDecider.m(fBTemplateDecider);
            pgh.o(m, "missing decider");
            String c = m.c();
            String k = FBTemplateDecider.k(fBTemplateDecider);
            k8u c2 = c(fBTemplateContent.getTplId());
            String str = c2.f22480a;
            String str2 = c2.b;
            String str3 = c2.c;
            String str4 = l2w.b(a2.pathPart, "") + "__" + l2w.b(str, c, "") + "__" + l2w.b(str2, k, "") + "@" + l2w.b(str3);
            File m2 = td9.m("fb__tpl_storage", str4);
            if (m2.exists()) {
                m2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(m2, false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            KVStorage.setKeyValue("fb__kv_checksum", "fb__tpl_storage_" + str4, String.valueOf(fBTemplateContent.toChecksum()));
            objectOutputStream.writeObject(fBTemplateContent);
            objectOutputStream.close();
            fileOutputStream.close();
        }
    }

    public static FBTemplateContent a(FBTemplateDecider fBTemplateDecider, FBSimpleTplInfo fBSimpleTplInfo, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("82641552", new Object[]{fBTemplateDecider, fBSimpleTplInfo, new Integer(i)});
        }
        String a2 = a(fBTemplateDecider, fBSimpleTplInfo, a(i));
        jst.a();
        File m = td9.m("fb__tpl_storage", a2);
        Serializable serializable = null;
        if (m.exists()) {
            FileInputStream fileInputStream = new FileInputStream(m);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            try {
                Object readObject = objectInputStream.readObject();
                if (!FBTemplateContent.class.isInstance(readObject)) {
                    pgh.p("read result is not an " + FBTemplateContent.class + " instance, but " + readObject.getClass());
                } else if (!(readObject instanceof Serializable)) {
                    pgh.p("read result is not serializable");
                } else if (!(readObject instanceof zta)) {
                    pgh.p("read result has not checksum");
                } else {
                    String keyValue = KVStorage.getKeyValue("fb__kv_checksum", "fb__tpl_storage_" + a2);
                    if (keyValue == null) {
                        pgh.p("no expected checksum");
                    } else if (((zta) readObject).toChecksum() == Long.parseLong(keyValue)) {
                        objectInputStream.close();
                        fileInputStream.close();
                        serializable = (Serializable) readObject;
                    } else {
                        pgh.p("checksum failed");
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        FBTemplateContent fBTemplateContent = (FBTemplateContent) serializable;
        if (fBTemplateContent == null || fBTemplateContent.verifyDataChecksumIfPreset()) {
            return fBTemplateContent;
        }
        throw new RuntimeException("fbTemplateContent 'data' checksum failed");
    }

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        try {
            return str.getBytes("utf-8");
        } catch (Throwable th) {
            pgh.m(th, "encode utf-8 error");
            return null;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        k8u c = c(str);
        String str3 = c.b;
        if (str3 != null) {
            str2 = str3;
        }
        return b(str2, c.c);
    }

    public static synchronized void a(final String str, String str2, Object obj) throws Exception {
        int i = 2;
        synchronized (ConnectionUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45199658", new Object[]{str, str2, obj});
                return;
            }
            jst.a();
            String a2 = a(str, str2, FBTemplateStorage$StorageType.DEFAULT);
            File c = td9.c("fb__tpl_storage/pack", a2, obj, true);
            if (c == null || !c.isFile()) {
                pgh.p("cannot write zip file " + a2);
            }
            String b = b(a2);
            jst.a();
            if (b.isEmpty()) {
                pgh.p("target folder/subfolder missingfb__tpl_storage/pack : ".concat(b));
            }
            File n = td9.n("fb__tpl_storage/pack", b);
            td9.f("fb__tpl_storage/pack", b);
            a(td9.i("fb__tpl_storage/pack", a2), n);
            Integer num = (Integer) uca.c("Conf:bn_deploy_package_cache_count");
            if (num != null) {
                i = num.intValue();
            }
            pgh.b("FBTemplateStorage", "maxNumToKeep: " + i);
            if (i > 0) {
                List<File> e = td9.e("fb__tpl_storage/pack", null, new FileFilter() { // from class: tb.zi4
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        String str3 = str;
                        return ConnectionUtils.$ipChange;
                    }
                });
                pgh.b("FBTemplateStorage", "cleaning, all files: " + e);
                for (int i2 = 0; i2 < e.size() - i; i2++) {
                    File file = e.get(i2);
                    td9.l("fb__tpl_storage/pack", file.getName());
                    pgh.b("FBTemplateStorage", "cleaning, deleted " + file);
                    String b2 = b(file.getName());
                    td9.k("fb__tpl_storage/pack", b2);
                    pgh.b("FBTemplateStorage", "cleaning, deleted dir " + b2);
                }
            }
        }
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b & 240) >> 4, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static int a(TextView textView, int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a4ac8d77", new Object[]{textView, new Integer(i), new Integer(i2), charSequence, charSequence2})).intValue();
        }
        textView.setText(((Object) charSequence.subSequence(i, i2)) + charSequence2.toString());
        return textView.getLayout().getLineCount();
    }

    public static FBTemplateStorage$StorageType a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateStorage$StorageType) ipChange.ipc$dispatch("6488432b", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return FBTemplateStorage$StorageType.DEFAULT;
        }
        if (i == 1) {
            return FBTemplateStorage$StorageType.GRAY;
        }
        if (i == 2) {
            return FBTemplateStorage$StorageType.EXP;
        }
        pgh.p("unknown storage type " + i);
        return null;
    }

    public static String a(FBTemplateDecider fBTemplateDecider, FBSimpleTplInfo fBSimpleTplInfo, FBTemplateStorage$StorageType fBTemplateStorage$StorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22f56d1a", new Object[]{fBTemplateDecider, fBSimpleTplInfo, fBTemplateStorage$StorageType});
        }
        tu8 m = FBTemplateDecider.m(fBTemplateDecider);
        pgh.o(m, "missing decider");
        String c = m.c();
        String k = FBTemplateDecider.k(fBTemplateDecider);
        k8u c2 = c(fBSimpleTplInfo.b());
        String str = c2.f22480a;
        String str2 = c2.b;
        String str3 = c2.c;
        return l2w.b(fBTemplateStorage$StorageType.pathPart, "") + "__" + l2w.b(str, c, "") + "__" + l2w.b(str2, k, "") + "@" + l2w.b(str3);
    }

    public static String a(String str, String str2, FBTemplateStorage$StorageType fBTemplateStorage$StorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61f07e94", new Object[]{str, str2, fBTemplateStorage$StorageType});
        }
        return a(str, fBTemplateStorage$StorageType) + l2w.b(str2, "") + ".zip";
    }

    public static String a(String str, FBTemplateStorage$StorageType fBTemplateStorage$StorageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50426c1e", new Object[]{str, fBTemplateStorage$StorageType});
        }
        return "pack__" + l2w.b(fBTemplateStorage$StorageType.pathPart, "") + "__" + l2w.b(str, "") + "__";
    }
}
