package com.android.taobao.safeclean;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.AdditionList;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import tb.bbi;
import tb.bsa;
import tb.dgg;
import tb.hc9;
import tb.icf;
import tb.jw4;
import tb.lh9;
import tb.mkv;
import tb.o7h;
import tb.pq6;
import tb.t2o;
import tb.voo;
import tb.vs3;
import tb.you;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class c implements pq6<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bsa f4594a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final c f4595a = new c();

        static {
            t2o.a(654311456);
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("184fd347", new Object[0]);
            }
            return f4595a;
        }
    }

    static {
        t2o.a(654311454);
        t2o.a(654311440);
    }

    public static c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ae60d9ac", new Object[0]);
        }
        return b.a();
    }

    /* renamed from: d */
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c735f00e", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str3)) {
            try {
                AdditionList additionList = (AdditionList) JSON.parseObject(str3, AdditionList.class);
                Log.e("SimpleAdditioner", additionList.toString());
                if (!o7h.b().g().equals(additionList.appVersion)) {
                    Log.e("SimpleAdditioner", "appVersion is not match!");
                } else if (additionList.additionDataList.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (AdditionList.AdditionModel additionModel : additionList.additionDataList) {
                        hc9 hc9Var = new hc9();
                        File b2 = b(additionModel.type, additionModel.fileRoot, additionModel.fileLocation);
                        Log.e("SimpleAdditioner", "translate location to:" + b2.getPath());
                        if (!new File(b2, additionModel.fileName).exists() || additionModel.overrideExit) {
                            if (!new File(b2, additionModel.fileName).exists() || !bbi.d(additionModel.fileMD5, new File(b2, additionModel.fileName).getAbsolutePath())) {
                                Log.e("SimpleAdditioner", "overide exited file:" + new File(b2, additionModel.fileName).getPath());
                                if (!b2.exists()) {
                                    b2.mkdirs();
                                }
                                hc9Var.f20538a = additionModel.fileUrl;
                                hc9Var.g = b2.getAbsolutePath();
                                hc9Var.c = additionModel.fileMD5;
                                hc9Var.h = additionModel.fileName;
                                hc9Var.b = additionModel.fileSize;
                                arrayList.add(hc9Var);
                            }
                        }
                    }
                    lh9.b().a(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        hc9 hc9Var2 = (hc9) it.next();
                        if (hc9Var2.d) {
                            voo.d(hc9Var2.h);
                        } else {
                            voo.c(hc9Var2.h, hc9Var2.e, hc9Var2.f);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("144d55ac", new Object[]{this, str});
        }
        return this.f4594a.a(str);
    }

    public c() {
        this.f4594a = null;
        this.f4594a = new bsa(Arrays.asList(new jw4(), new you(), new icf(), new dgg(), new mkv()));
    }

    public final File b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("39b616d5", new Object[]{this, str, str2, str3});
        }
        String e = e(str3);
        if (str.equals("internal")) {
            if (str2.equals(vs3.FILES_DIR_NAME)) {
                return new File(d.d.getFilesDir(), e);
            }
            if (str2.equals("cache")) {
                return new File(d.d.getCacheDir(), e);
            }
            return new File(d.d.getDir(str2, 0), e);
        } else if (!str.equals(UiUtil.INPUT_TYPE_VALUE_EXTERNAL)) {
            return null;
        } else {
            if (str2.equals(vs3.FILES_DIR_NAME)) {
                return new File(d.d.getExternalFilesDir(null), e);
            }
            if (str2.equals("cache")) {
                return new File(d.d.getExternalCacheDir(), e);
            }
            return new File(d.d.getExternalCacheDir().getParentFile(), e);
        }
    }
}
