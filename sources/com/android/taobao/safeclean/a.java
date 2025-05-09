package com.android.taobao.safeclean;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.CleanList;
import com.android.taobao.safeclean.d;
import java.io.File;
import java.io.FileFilter;
import java.util.List;
import tb.bsa;
import tb.ckf;
import tb.dgg;
import tb.icf;
import tb.jw4;
import tb.mkv;
import tb.ph9;
import tb.t2o;
import tb.vs3;
import tb.you;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bsa f4592a;

    /* compiled from: Taobao */
    /* renamed from: com.android.taobao.safeclean.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface AbstractC0232a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f4593a;

        static {
            t2o.a(654311431);
        }

        public b(String str) {
            this.f4593a = str;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            String str2 = this.f4593a;
            if (str2 == null || str2.length() == 0) {
                return true;
            }
            if (file != null) {
                str = ph9.g(file);
            } else {
                str = null;
            }
            if (ckf.b(str, this.f4593a)) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(654311429);
    }

    public a() {
        icf icfVar = new icf();
        this.f4592a = new bsa(yz3.l(new you(), new jw4(), icfVar, new mkv(), new dgg()));
    }

    public final void a(File file, String str, String str2) {
        File[] fileArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92541754", new Object[]{this, file, str, str2});
        } else if (file.exists()) {
            if (!TextUtils.isEmpty(str)) {
                fileArr = file.listFiles(new b(str));
                if (fileArr == null) {
                    return;
                }
            } else {
                fileArr = file.listFiles();
                if (fileArr == null) {
                    file.delete();
                    return;
                }
            }
            int length = fileArr.length;
            for (int i = 0; i < length; i++) {
                if (fileArr[i].isDirectory() && !ckf.b(fileArr[i].getName(), str2)) {
                    a(fileArr[i], str, str2);
                } else if (fileArr[i].isFile() && !ckf.b(fileArr[i].getName(), str2)) {
                    fileArr[i].delete();
                }
            }
            if (TextUtils.isEmpty(str)) {
                file.delete();
            }
        }
    }

    public final boolean b(File file, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f386ea5d", new Object[]{this, file, str, str2})).booleanValue();
        }
        if (file.isDirectory()) {
            a(file, str, str2);
        } else {
            file.delete();
        }
        return !file.exists();
    }

    public final String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bbc6121", new Object[]{this, str});
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        return this.f4592a.a(str);
    }

    public final synchronized void c(List<CleanList.CleanModel> list, AbstractC0232a aVar) {
        File file;
        File filesDir;
        File externalFilesDir;
        File externalCacheDir;
        SharedPreferences.Editor remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b8b678", new Object[]{this, list, aVar});
            return;
        }
        ckf.g(list, "cleanDataList");
        ckf.g(aVar, "cleanCallback");
        for (CleanList.CleanModel cleanModel : list) {
            String str = cleanModel.type;
            ckf.f(str, "cleanData.type");
            String str2 = cleanModel.fileRoot;
            String str3 = cleanModel.exclude;
            ckf.f(str3, "cleanData.exclude");
            String str4 = cleanModel.extension;
            ckf.f(str4, "cleanData.extension");
            String d = d(cleanModel.fileLocation);
            File file2 = null;
            SharedPreferences sharedPreferences = null;
            File file3 = null;
            File file4 = null;
            r10 = null;
            String str5 = null;
            r10 = null;
            File file5 = null;
            File file6 = null;
            File file7 = null;
            r10 = null;
            String str6 = null;
            if (ckf.b(str, "internal")) {
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != 0) {
                        if (hashCode != 94416770) {
                            if (hashCode == 97434231 && str2.equals(vs3.FILES_DIR_NAME)) {
                                Application application = d.d;
                                if (application != null) {
                                    file6 = application.getFilesDir();
                                }
                                file = new File(file6, d);
                            }
                        } else if (str2.equals("cache")) {
                            Application application2 = d.d;
                            if (application2 != null) {
                                file7 = application2.getCacheDir();
                            }
                            file = new File(file7, d);
                        }
                    } else if (str2.equals("")) {
                        Application application3 = d.d;
                        if (!(application3 == null || (filesDir = application3.getFilesDir()) == null)) {
                            str6 = filesDir.getParent();
                        }
                        file = new File(str6, d);
                    }
                }
                Application application4 = d.d;
                if (application4 != null) {
                    file2 = application4.getDir(str2, 0);
                }
                file = new File(file2, d);
            } else if (ckf.b(str, UiUtil.INPUT_TYPE_VALUE_EXTERNAL)) {
                if (str2 != null) {
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 != 0) {
                        if (hashCode2 != 94416770) {
                            if (hashCode2 == 97434231 && str2.equals(vs3.FILES_DIR_NAME)) {
                                Application application5 = d.d;
                                if (application5 != null) {
                                    file3 = application5.getExternalFilesDir(null);
                                }
                                file = new File(file3, d);
                            }
                        } else if (str2.equals("cache")) {
                            Application application6 = d.d;
                            if (application6 != null) {
                                file4 = application6.getExternalCacheDir();
                            }
                            file = new File(file4, d);
                        }
                    } else if (str2.equals("")) {
                        Application application7 = d.d;
                        if (!(application7 == null || (externalCacheDir = application7.getExternalCacheDir()) == null)) {
                            str5 = externalCacheDir.getParent();
                        }
                        file = new File(str5, d);
                    }
                }
                Application application8 = d.d;
                if (!(application8 == null || (externalFilesDir = application8.getExternalFilesDir(null)) == null)) {
                    file5 = externalFilesDir.getParentFile();
                }
                file = new File(file5, d);
            } else {
                Application application9 = d.d;
                if (application9 != null) {
                    sharedPreferences = application9.getSharedPreferences(str2, 0);
                }
                if (sharedPreferences == null || !sharedPreferences.contains(d)) {
                    ((d.a) aVar).c(cleanModel.dataId);
                } else {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (!(edit == null || (remove = edit.remove(d)) == null)) {
                        remove.apply();
                    }
                    ((d.a) aVar).d(cleanModel.dataId);
                }
            }
            if (file.exists()) {
                Log.e("CleanBusiness", "clean file:" + file.getAbsolutePath());
                boolean b2 = b(file, str4, str3);
                if (!b2) {
                    ((d.a) aVar).b(cleanModel.dataId);
                } else if (b2) {
                    ((d.a) aVar).d(cleanModel.dataId);
                }
            } else {
                ((d.a) aVar).c(cleanModel.dataId);
                Log.e("CleanBusiness", "clean file not exit:" + file.getAbsolutePath());
            }
        }
        ((d.a) aVar).a();
    }
}
