package com.ali.alihadeviceevaluator.old;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import tb.lp0;
import tb.sok;
import tb.z9a;
import tb.zym;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HardWareInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f1869a;
    public String b;
    public int c;
    public float d;
    public float e;
    public float[] f;
    public String g;
    public String h;
    public long i;
    public String j;
    public ViewGroup n;
    public OnlineGLSurfaceView o;
    public final String p;
    public boolean q;
    public final sok r = new sok();
    public final float m = lp0.d().c().f23477a;
    public final int k = lp0.d().c().b;
    public final int l = lp0.d().c().c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class OnlineGLSurfaceView extends GLSurfaceView {
        public a mRenderer;

        public OnlineGLSurfaceView(Context context) {
            super(context);
            setEGLConfigChooser(8, 8, 8, 8, 0, 0);
            HardWareInfo.this.getClass();
            a aVar = new a();
            this.mRenderer = aVar;
            setRenderer(aVar);
            Log.e("HardWareInfo", "OnlineGLSurfaceView");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements GLSurfaceView.Renderer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.ali.alihadeviceevaluator.old.HardWareInfo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0026a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0026a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Log.e("HardWareInfo", "run destroy");
                HardWareInfo.this.b();
            }
        }

        public a() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d186971d", new Object[]{this, gl10});
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("893091d9", new Object[]{this, gl10, new Integer(i), new Integer(i2)});
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2ea8368", new Object[]{this, gl10, eGLConfig});
                return;
            }
            try {
                HardWareInfo.this.g = gl10.glGetString(7937);
                HardWareInfo.this.h = gl10.glGetString(7936);
                Log.e("HardWareInfo", "onSurfaceCreated");
                new Handler(Looper.getMainLooper()).post(new RunnableC0026a());
                try {
                    HardWareInfo hardWareInfo = HardWareInfo.this;
                    hardWareInfo.i = hardWareInfo.h();
                } catch (Throwable unused) {
                }
                HardWareInfo.a(HardWareInfo.this).a(HardWareInfo.this);
            } catch (Throwable unused2) {
            }
        }
    }

    public HardWareInfo(Context context) {
        Throwable th;
        Exception e;
        BufferedReader bufferedReader;
        this.c = 0;
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            this.p = filesDir.getAbsolutePath() + "/deviceInfo";
        } else {
            this.p = "";
        }
        File file = new File(this.p);
        if (file.exists()) {
            this.q = true;
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(file));
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    try {
                        this.f1869a = bufferedReader.readLine();
                        this.b = bufferedReader.readLine();
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            this.c = Integer.parseInt(readLine);
                        }
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            this.d = Float.parseFloat(readLine2);
                        }
                        String readLine3 = bufferedReader.readLine();
                        if (readLine3 != null) {
                            float parseFloat = Float.parseFloat(readLine3);
                            this.e = parseFloat;
                            if (parseFloat <= 0.0f) {
                                this.e = this.d;
                            }
                        }
                        String readLine4 = bufferedReader.readLine();
                        if (this.f == null) {
                            this.f = new float[d()];
                        }
                        if (readLine4 != null) {
                            try {
                                String[] split = readLine4.split(",");
                                if (split != null && split.length > 0) {
                                    for (int i = 0; i < split.length; i++) {
                                        this.f[i] = Float.parseFloat(split[i]);
                                    }
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        this.g = bufferedReader.readLine();
                        this.h = bufferedReader.readLine();
                        String readLine5 = bufferedReader.readLine();
                        if (readLine5 != null) {
                            this.i = Long.parseLong(readLine5);
                        }
                        try {
                            String readLine6 = bufferedReader.readLine();
                            if (!TextUtils.isEmpty(readLine6)) {
                                this.j = readLine6;
                            } else {
                                this.j = c();
                            }
                        } catch (Throwable unused) {
                        }
                        int length = this.f.length;
                        bufferedReader.close();
                    } catch (Exception e5) {
                        e = e5;
                        bufferedReader2 = bufferedReader;
                        Log.e(z9a.TAG, "load local file failed!!");
                        e.printStackTrace();
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        d();
                        e();
                        l();
                        c();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        d();
        e();
        l();
        c();
    }

    public static /* synthetic */ sok a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sok) ipChange.ipc$dispatch("94fc5be4", new Object[]{hardWareInfo});
        }
        return hardWareInfo.r;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.n != null) {
            Log.e("HardWareInfo", "remove GLView");
            try {
                this.n.removeView(this.o);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.o = null;
            this.n = null;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f99f512b", new Object[]{this})).intValue();
        }
        if (this.c == 0) {
            this.c = Runtime.getRuntime().availableProcessors();
        }
        return this.c;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a89b7ba", new Object[]{this})).intValue();
        }
        return this.r.f28174a;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("574dbf98", new Object[]{this})).intValue();
        }
        return this.r.d;
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc76e45d", new Object[]{this, context});
        } else if (!this.q) {
            try {
                if (context instanceof Activity) {
                    ViewGroup viewGroup = (ViewGroup) ((Activity) context).getWindow().getDecorView();
                    this.n = viewGroup;
                    if (viewGroup != null) {
                        OnlineGLSurfaceView onlineGLSurfaceView = new OnlineGLSurfaceView(context);
                        this.o = onlineGLSurfaceView;
                        onlineGLSurfaceView.setAlpha(0.0f);
                        this.n.addView(this.o, new ViewGroup.LayoutParams(1, 1));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39504d36", new Object[]{this})).intValue();
        }
        return this.r.b;
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58f4a5a9", new Object[]{this})).floatValue();
        }
        float f = this.d;
        if (f > 0.0f && this.f != null) {
            return f;
        }
        if (this.f == null) {
            this.f = new float[d()];
        }
        for (int i = 0; i < d(); i++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String readLine = bufferedReader.readLine();
                    fileReader.close();
                    bufferedReader.close();
                    if (readLine != null) {
                        float parseLong = ((float) Long.parseLong(readLine)) / 1000000.0f;
                        this.f[i] = parseLong;
                        if (this.d < parseLong) {
                            this.d = parseLong;
                        }
                        float f2 = this.e;
                        if (f2 == 0.0f) {
                            this.e = parseLong;
                        } else if (f2 > parseLong) {
                            this.e = parseLong;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.e == 0.0f) {
            this.e = this.d;
        }
        if (this.q) {
            this.q = false;
            o();
        }
        return this.d;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f5af62d", new Object[]{this})).intValue();
        }
        return this.r.c;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e409b56", new Object[]{this})).intValue();
        }
        sok sokVar = this.r;
        if (sokVar.e == 0) {
            sokVar.a(this);
        }
        return this.r.e;
    }

    public void o() {
        Throwable th;
        Exception e;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e82c75", new Object[]{this});
        } else if (!this.q && this.g != null && zym.d()) {
            this.q = true;
            File file = new File(this.p);
            if (file.exists()) {
                file.delete();
            }
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bufferedWriter.write(this.f1869a);
                bufferedWriter.newLine();
                bufferedWriter.write(this.b);
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(this.c));
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(this.d));
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(this.e));
                bufferedWriter.newLine();
                StringBuilder sb = new StringBuilder(50);
                float[] fArr = this.f;
                if (fArr != null && fArr.length > 0) {
                    int i = 0;
                    while (true) {
                        float[] fArr2 = this.f;
                        if (i >= fArr2.length) {
                            break;
                        }
                        sb.append(fArr2[i]);
                        if (i < this.f.length - 1) {
                            sb.append(',');
                        }
                        i++;
                    }
                }
                bufferedWriter.write(sb.toString());
                bufferedWriter.newLine();
                bufferedWriter.write(this.g);
                bufferedWriter.newLine();
                bufferedWriter.write(this.h);
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(this.i));
                bufferedWriter.newLine();
                bufferedWriter.write(String.valueOf(this.j));
                bufferedWriter.newLine();
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (Exception e4) {
                e = e4;
                bufferedWriter2 = bufferedWriter;
                e.printStackTrace();
                this.q = false;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }

    public String c() {
        int i;
        String str = "UnKnown";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303d8211", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String readLine = bufferedReader.readLine();
            while (true) {
                if (readLine == null) {
                    str = str;
                    break;
                } else if (readLine.contains("AArch") || readLine.contains("ARM") || readLine.contains("Intel(R)") || readLine.contains("model name")) {
                    int indexOf = readLine.indexOf(": ");
                    if (indexOf >= 0) {
                        readLine = readLine.substring(indexOf + 2);
                        if (!readLine.contains("Intel(R)")) {
                            i = readLine.indexOf(32);
                        } else {
                            i = readLine.lastIndexOf(41) + 1;
                        }
                        if (i > 0) {
                            str = readLine.substring(0, i);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    readLine = bufferedReader.readLine();
                }
            }
            bufferedReader.close();
        } catch (Exception unused) {
        }
        this.j = str;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.alihadeviceevaluator.old.HardWareInfo.e():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
        r1 = new java.io.File(r4[r0].getAbsolutePath() + "/max_freq");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r1.exists() != false) goto L_0x00d4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r1 = new java.io.File(r4[r0].getAbsolutePath() + "/max_gpuclk");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
        if (r1.exists() == false) goto L_0x00ff;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
        r0 = new java.io.FileReader(r1);
        r1 = new java.io.BufferedReader(r0);
        r4 = r1.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
        if (r4 == null) goto L_0x00f6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
        r8 = java.lang.Long.parseLong(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
        if (r8 <= 0) goto L_0x00f6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
        r8 = (r8 / 1000) / 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
        r0.close();
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long h() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.alihadeviceevaluator.old.HardWareInfo.h():long");
    }

    public long k(String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66717088", new Object[]{this, str})).longValue();
        }
        long j = 0;
        try {
            File file2 = new File(str);
            if (!file2.exists() || !file2.isDirectory()) {
                j = 0;
            } else {
                File[] listFiles = file2.listFiles();
                if (listFiles == null) {
                    return 0L;
                }
                j = 0;
                for (File file3 : listFiles) {
                    try {
                        if (file3 != null && file3.getName().contains("kgsl") && file3.isDirectory()) {
                            j = k(file3.getAbsolutePath());
                            if (j > 0) {
                                return j;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            file = new File(str + "/max_freq");
            if (!file.exists()) {
                file = new File(str + "/max_gpuclk");
            }
        } catch (Exception unused2) {
        }
        if (!file.exists()) {
            return j;
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine = bufferedReader.readLine();
        if (readLine != null) {
            long parseLong = Long.parseLong(readLine);
            if (parseLong > 0) {
                try {
                    j = (parseLong / 1000) / 1000;
                } catch (Exception unused3) {
                    j = parseLong;
                }
            } else {
                j = parseLong;
            }
        } else {
            j = j;
        }
        fileReader.close();
        bufferedReader.close();
        return j;
    }
}
