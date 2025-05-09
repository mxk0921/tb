package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.StickerMaiMaterialBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t8i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Comparator<File> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue();
            }
            return Long.compare(file2.lastModified(), file.lastModified());
        }
    }

    static {
        t2o.a(782237758);
    }

    public static String a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd8dafb1", new Object[]{str, new Integer(i), str2});
        }
        return b(str, i, str2, false);
    }

    public static String b(String str, int i, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87666b5b", new Object[]{str, new Integer(i), str2, new Boolean(z)});
        }
        String e = ztl.e(str, z);
        return e + File.separator + c(str, i, str2);
    }

    public static String c(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2b289a1", new Object[]{str, new Integer(i), str2});
        }
        if (!TextUtils.isEmpty(str2)) {
            String d = doh.d(str2);
            if (d == null) {
                return String.valueOf(str2.hashCode());
            }
            return d;
        } else if (i < 0) {
            return str;
        } else {
            return str + "_" + i;
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f03f599a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str, "material.json");
        if (file.exists()) {
            try {
                StickerMaiMaterialBean stickerMaiMaterialBean = (StickerMaiMaterialBean) JSON.parseObject(z1d.a(file), StickerMaiMaterialBean.class);
                if (stickerMaiMaterialBean != null) {
                    List<StickerMaiMaterialBean.ModuleTree> list = stickerMaiMaterialBean.modules;
                    if (list != null && !list.isEmpty()) {
                        return l(str, stickerMaiMaterialBean);
                    }
                    StickerMaiMaterialBean.Info info = stickerMaiMaterialBean.info;
                    if (info != null) {
                        if (TextUtils.equals(info.type, "Animation")) {
                            return j(str, stickerMaiMaterialBean);
                        }
                        return k(str, stickerMaiMaterialBean);
                    }
                }
            } catch (Exception e) {
                Log.e("MaterialFile", e.getMessage());
            }
        }
        return "";
    }

    public static String e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd5f6607", new Object[]{file});
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return null;
        }
        if (listFiles.length == 1) {
            File file2 = listFiles[0];
            if (i(file2)) {
                return file2.getAbsolutePath();
            }
            return null;
        }
        List asList = Arrays.asList(listFiles);
        Collections.sort(asList, new a());
        File file3 = (File) asList.get(0);
        if (i(file3)) {
            return file3.getAbsolutePath();
        }
        return null;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("768ca769", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str, "material.json");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return "";
    }

    @Deprecated
    public static boolean g(String str, int i, long j) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb00fad5", new Object[]{str, new Integer(i), new Long(j)})).booleanValue();
        }
        String d = ztl.d(str, i, false);
        if (!uf9.g(d)) {
            String e = ztl.e(str, false);
            if (!uf9.g(e) || e(new File(e)) == null) {
                return false;
            }
            return true;
        } else if ((j <= 0 || new File(d).lastModified() >= j) && (listFiles = new File(d).listFiles()) != null && listFiles.length > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean i(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("963e9326", new Object[]{file})).booleanValue();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return false;
        }
        if (listFiles.length != 1 || !listFiles[0].getName().endsWith(ztl.c())) {
            return true;
        }
        return false;
    }

    public static String j(String str, StickerMaiMaterialBean stickerMaiMaterialBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52d0d482", new Object[]{str, stickerMaiMaterialBean});
        }
        File[] listFiles = new File(new File(str, stickerMaiMaterialBean.info.path).getParent()).listFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            String lowerCase = file.getName().toLowerCase();
            if (lowerCase.endsWith(".png") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg")) {
                arrayList.add(lowerCase);
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        arrayList.toArray(strArr);
        Arrays.sort(strArr);
        return strArr[size - 1];
    }

    public static String k(String str, StickerMaiMaterialBean stickerMaiMaterialBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73320667", new Object[]{str, stickerMaiMaterialBean});
        }
        if (TextUtils.isEmpty(stickerMaiMaterialBean.info.path)) {
            return "";
        }
        return new File(str, stickerMaiMaterialBean.info.path).getAbsolutePath();
    }

    public static String l(String str, StickerMaiMaterialBean stickerMaiMaterialBean) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b047a51", new Object[]{str, stickerMaiMaterialBean});
        }
        StickerMaiMaterialBean.ModuleTree moduleTree = stickerMaiMaterialBean.modules.get(0);
        if (moduleTree == null || (list = moduleTree.images) == null || list.isEmpty()) {
            return null;
        }
        return str + File.separator + moduleTree.images.get(0);
    }

    public static boolean h(String str, String str2, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d30c8e1f", new Object[]{str, str2, new Integer(i), new Long(j)})).booleanValue();
        }
        String a2 = a(str2, i, str);
        if (!uf9.g(a2)) {
            return g(str2, i, j);
        }
        File file = new File(a2);
        if (j <= 0 || file.lastModified() >= j) {
            int b = t9l.b();
            if (b <= 0 || uf9.d(file, b) >= b) {
                File[] listFiles = new File(a2).listFiles();
                return listFiles != null && listFiles.length > 0;
            }
            Log.e("TPMaterial", "tid = " + str2 + " , folder is empty");
            return false;
        }
        Log.e("TPMaterial", "tid = " + str2 + " data expired");
        return false;
    }
}
