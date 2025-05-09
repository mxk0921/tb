package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.update.datasource.local.UpdateInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class akv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EFFECTIVE_VERSION = "instantpatch_effective_version";
    public static akv e;

    /* renamed from: a  reason: collision with root package name */
    public final int f15796a;
    public final SharedPreferences b;
    public final String c;
    public UpdateInfo d;

    static {
        t2o.a(950009892);
    }

    public akv(Context context) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        File file = new File(context.getCacheDir().getPath(), "mtl_update.json");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        this.c = file.getAbsolutePath();
        try {
            if (!nkv.getVersionName().equals(this.b.getString("instantpatch_mainversion", ""))) {
                this.f15796a = 0;
            } else {
                this.f15796a = Integer.parseInt(this.b.getString("instantpatch_effective_version", "0"));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static akv getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (akv) ipChange.ipc$dispatch("2fc38697", new Object[]{context});
        }
        if (e == null) {
            if (context == null) {
                context = kjv.sContext;
            }
            e = new akv(context);
        }
        return e;
    }

    public final String a(InputStream inputStream) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0986d93", new Object[]{this, inputStream});
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59166b3", new Object[]{this, str});
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            String a2 = a(fileInputStream);
            fileInputStream.close();
            return a2;
        } catch (Throwable th) {
            Log.e(TLogTracker.SCENE_EXCEPTION, "File read failed: " + th.toString());
            return "";
        }
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17e1771", new Object[]{this, str, str2});
            return;
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(str2)));
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (IOException e2) {
            Log.e(TLogTracker.SCENE_EXCEPTION, "File write failed: " + e2.toString());
        }
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.d = null;
        c("", this.c);
    }

    public UpdateInfo getCacheData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo) ipChange.ipc$dispatch("8d32fe3c", new Object[]{this});
        }
        return this.d;
    }

    public int getCurrentPatchVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1d4d74d", new Object[]{this})).intValue();
        }
        return this.f15796a;
    }

    public UpdateInfo getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo) ipChange.ipc$dispatch("d7276c46", new Object[]{this});
        }
        if (this.d == null) {
            String b = b(this.c);
            if (!TextUtils.isEmpty(b)) {
                try {
                    this.d = (UpdateInfo) JSON.parseObject(b, UpdateInfo.class);
                } catch (Throwable unused) {
                }
            }
        }
        return this.d;
    }

    public String getSP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12af6e9c", new Object[]{this, str});
        }
        return this.b.getString(str, "");
    }

    public void resetData(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953fa10f", new Object[]{this, updateInfo});
            return;
        }
        this.d = updateInfo;
        updateInfo.lastUpdateTime = System.currentTimeMillis();
        c(JSON.toJSONString(this.d), this.c);
    }

    public void resetMemoryData(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c31260e", new Object[]{this, updateInfo});
            return;
        }
        this.d = updateInfo;
        updateInfo.lastUpdateTime = System.currentTimeMillis();
    }

    public void updateData(UpdateInfo updateInfo) {
        Map<String, UpdateInfo.UpdateData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e916a455", new Object[]{this, updateInfo});
        } else if (updateInfo != null && (map = updateInfo.updateList) != null) {
            UpdateInfo updateInfo2 = this.d;
            if (updateInfo2 == null) {
                this.d = updateInfo;
            } else {
                updateInfo2.updateList.putAll(map);
            }
            this.d.updateList.remove("cmd");
            this.d.lastUpdateTime = System.currentTimeMillis();
            c(JSON.toJSONString(this.d), this.c);
        }
    }

    public void updateSP(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ff1901", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
