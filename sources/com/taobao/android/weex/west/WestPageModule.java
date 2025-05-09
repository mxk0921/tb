package com.taobao.android.weex.west;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.WeexValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import tb.bxh;
import tb.d7x;
import tb.dwh;
import tb.dxh;
import tb.f4x;
import tb.f9x;
import tb.fxh;
import tb.gpc;
import tb.mbj;
import tb.r3x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WestPageModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "WestPage";
    private WestPageActivity mWestActivity;

    static {
        t2o.a(982515983);
        t2o.a(982515802);
    }

    private File getWestreportDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("16f77832", new Object[]{this});
        }
        return new File(this.mWestActivity.getCacheDir(), "westreport");
    }

    public boolean deleteDirectory(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed50244", new Object[]{this, file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                deleteDirectory(file2);
            }
        }
        return file.delete();
    }

    @WeexMethod(uiThread = false)
    public void download(JSONObject jSONObject, f4x f4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298fb46f", new Object[]{this, jSONObject, f4xVar});
            return;
        }
        String string = jSONObject.getString("url");
        gpc f = r3x.f();
        bxh bxhVar = new bxh();
        bxhVar.d = "GET";
        bxhVar.c = string;
        f.a(bxhVar, new a(this, f4xVar));
    }

    @WeexMethod(uiThread = false)
    public String getTmpDirPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40f14268", new Object[]{this});
        }
        try {
            return getWestreportDir().getAbsolutePath();
        } catch (Exception e) {
            dwh.i(e);
            return null;
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, d7x d7xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb16df30", new Object[]{this, str, d7xVar});
            return;
        }
        Context context = d7xVar.getInstance().getContext();
        f9x.a(context instanceof WestPageActivity);
        this.mWestActivity = (WestPageActivity) context;
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }

    @WeexMethod(uiThread = false)
    public void postMessageToClient(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f688dc", new Object[]{this, jSONObject});
        } else {
            this.mWestActivity.p3(jSONObject);
        }
    }

    @WeexMethod(uiThread = false)
    public void postMessageToDriver(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e64a9f", new Object[]{this, jSONObject});
        } else {
            this.mWestActivity.q3(jSONObject);
        }
    }

    @WeexMethod(uiThread = true)
    public void setBackgroundText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43520b4e", new Object[]{this, str});
        } else {
            this.mWestActivity.r3(str);
        }
    }

    @WeexMethod(uiThread = true)
    public void setupTestInstance(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51842c41", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else if (this.mWestActivity.s3(jSONObject)) {
            if (f4xVar != null) {
                f4xVar.b(new Object[0]);
            }
        } else if (f4xVar2 != null) {
            f4xVar2.b(new Object[0]);
        }
    }

    @WeexMethod(uiThread = true)
    public void takeScreenShot(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f6a458", new Object[]{this, jSONObject, f4xVar, f4xVar2});
            return;
        }
        File file = new File(getWestreportDir(), jSONObject.getString("fileName"));
        this.mWestActivity.t3(file.getAbsolutePath(), f4xVar, f4xVar2);
        dwh.f("[West]", "screenshot: " + file.getAbsolutePath());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9933a;

        public a(WestPageModule westPageModule, f4x f4xVar) {
            this.f9933a = f4xVar;
        }

        @Override // tb.gpc.a
        public void onHeadersReceived(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6683fc51", new Object[]{this, new Integer(i), map});
            }
        }

        @Override // tb.gpc.a
        public void onHttpResponseProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1a5c7", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.gpc.a
        public void onHttpStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5005ca2", new Object[]{this});
            }
        }

        @Override // tb.gpc.a
        public void a(dxh dxhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebddd68c", new Object[]{this, dxhVar});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", (Object) dxhVar.f18133a);
            jSONObject.put("data", (Object) dxhVar.b);
            this.f9933a.b(jSONObject);
        }
    }

    @WeexMethod(uiThread = true)
    public void clickAt(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8059f7aa", new Object[]{this, jSONObject, f4xVar, f4xVar2});
            return;
        }
        float i = fxh.i(this.mWestActivity, jSONObject.getFloat("x").floatValue());
        float i2 = fxh.i(this.mWestActivity, jSONObject.getFloat("y").floatValue());
        if (this.mWestActivity.m3(i, i2)) {
            if (f4xVar != null) {
                f4xVar.b(new Object[0]);
            }
        } else if (f4xVar2 != null) {
            f4xVar2.b(new Object[0]);
        }
        dwh.f("[West]", "click at: " + jSONObject.toJSONString() + "pixel" + i + ":" + i2);
    }

    @WeexMethod(uiThread = false)
    public boolean makeTmpDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ff8a0f", new Object[]{this})).booleanValue();
        }
        try {
            File cacheDir = this.mWestActivity.getCacheDir();
            File file = new File(cacheDir, "westreport");
            dwh.f("[West]", "ResultDir: " + file.getAbsolutePath());
            if (file.exists()) {
                deleteDirectory(file);
                file = new File(cacheDir, "westreport");
                dwh.f("[West]", "delete dir: " + file.getAbsolutePath());
            }
            file.mkdir();
            return true;
        } catch (Exception e) {
            dwh.i(e);
            return false;
        }
    }

    @WeexMethod(uiThread = false)
    public boolean makeZip(String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a804d4a8", new Object[]{this, str})).booleanValue();
        }
        try {
            File westreportDir = getWestreportDir();
            File[] listFiles = westreportDir.listFiles();
            File file = new File(westreportDir, str);
            dwh.f("[West]", "report zip file: " + file.getAbsolutePath());
            ZipOutputStream zipOutputStream = null;
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    for (File file2 : listFiles) {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read > 0) {
                                zipOutputStream.write(bArr, 0, read);
                            }
                        }
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    }
                    zipOutputStream.close();
                    zipOutputStream.close();
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    if (zipOutputStream != null) {
                        zipOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e) {
            dwh.i(e);
            return false;
        }
    }

    @WeexMethod(uiThread = false)
    public boolean uploadFile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc2db03c", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            File file = new File(getWestreportDir(), str);
            try {
                String a2 = mbj.a(str2, new String[]{file.getAbsolutePath()}, str);
                dwh.f("[West]", "uploadFile file: " + file.getAbsolutePath() + ", ret: " + a2);
                return true;
            } catch (Exception e) {
                dwh.g("[West]", "uploadFile file: " + file.getAbsolutePath() + "failed", e);
                return false;
            }
        } catch (Exception e2) {
            dwh.i(e2);
            return false;
        }
    }

    @WeexMethod(uiThread = false)
    public boolean writeFileBuffer(String str, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb9c58a4", new Object[]{this, str, weexValue})).booleanValue();
        }
        try {
            byte[] arrayBuffer = weexValue.getArrayBuffer();
            File file = new File(getWestreportDir(), str);
            dwh.f("[West]", "write file: " + file.getAbsolutePath());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(arrayBuffer);
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            dwh.i(e);
            return false;
        }
    }

    @WeexMethod(uiThread = false)
    public boolean writeFileString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("283c440b", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            File file = new File(getWestreportDir(), str);
            dwh.f("[West]", "write file: " + file.getAbsolutePath());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(str2);
            outputStreamWriter.close();
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            dwh.i(e);
            return false;
        }
    }
}
