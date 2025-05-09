package com.alibaba.ability.impl.file;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.impl.TransParentActivity;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsFilePickerAbility;
import com.taobao.android.abilityidl.ability.FilePickerResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.bvl;
import tb.ckf;
import tb.ed9;
import tb.hp2;
import tb.iih;
import tb.kdb;
import tb.lw3;
import tb.t2o;
import tb.t6c;
import tb.u6h;
import tb.ua0;
import tb.vii;
import tb.wh6;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FilePickerAbility extends AbsFilePickerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(106954765);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(106954764);
    }

    public static /* synthetic */ Object ipc$super(FilePickerAbility filePickerAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/file/FilePickerAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsFilePickerAbility
    public void open(kdb kdbVar, ed9 ed9Var, t6c t6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7836581", new Object[]{this, kdbVar, ed9Var, t6cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(ed9Var, "params");
        ckf.g(t6cVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            String businessID = kdbVar.l().getBusinessID();
            String a2 = bvl.INSTANCE.a(context, businessID);
            iih iihVar = iih.INSTANCE;
            iihVar.b("FilePickerAbility", "当前业务身份是：" + businessID + ", 沙盒路径是：" + a2);
            Intent intent = new Intent(context, TransParentActivity.class);
            intent.putExtra("sandbox", a2);
            intent.putExtra("multiple", ed9Var.f18500a);
            TransParentActivity.Companion.b(intent, context, new b(this, t6cVar));
            return;
        }
        t6cVar.O(ErrorResult.a.Companion.g("context is null"));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class b extends ua0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ContentResolver b;
        public WeakReference<Activity> d;
        public boolean e;
        public final t6c g;

        /* renamed from: a  reason: collision with root package name */
        public final int f1944a = 10000;
        public String c = "";
        public final String f = "_picker";

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ List b;
            public final /* synthetic */ vii c;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.ability.impl.file.FilePickerAbility$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public static final class RunnableC0045a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0045a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Activity activity;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.this.c.b(null);
                    WeakReference c = b.c(b.this);
                    if (c != null && (activity = (Activity) c.get()) != null) {
                        activity.finish();
                    }
                }
            }

            public a(List list, vii viiVar) {
                this.b = list;
                this.c = viiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC0045a aVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    try {
                        ContentResolver d = b.d(b.this);
                        if (d != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Uri uri : this.b) {
                                Cursor query = d.query(uri, null, null, null, null);
                                String uri2 = uri.toString();
                                ckf.f(uri2, "uri.toString()");
                                if (query != null) {
                                    if (!query.moveToFirst()) {
                                        query = null;
                                    }
                                    if (query != null) {
                                        Cursor cursor = query;
                                        Cursor cursor2 = cursor;
                                        uri2 = cursor2.getString(cursor2.getColumnIndex("_display_name"));
                                        ckf.f(uri2, "it.getString(nameIndex)");
                                        xhv xhvVar = xhv.INSTANCE;
                                        lw3.a(cursor, null);
                                    }
                                }
                                InputStream openInputStream = d.openInputStream(uri);
                                if (openInputStream != null) {
                                    File file = new File(b.f(b.this) + wh6.DIR + uri2);
                                    File parentFile = file.getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    hp2.b(openInputStream, fileOutputStream, 0, 2, null);
                                    arrayList.add("file://" + b.e(b.this) + wh6.DIR + uri2);
                                    xhv xhvVar2 = xhv.INSTANCE;
                                    lw3.a(fileOutputStream, null);
                                    lw3.a(openInputStream, null);
                                }
                            }
                            FilePickerResult filePickerResult = new FilePickerResult();
                            filePickerResult.paths = arrayList;
                            b.b(b.this).l(filePickerResult);
                        } else {
                            b.b(b.this).O(new ErrorResult("FILE_COPY_FAILED", "ContentResolver 为空，文件拷贝失败", (Map) null, 4, (a07) null));
                            xhv xhvVar3 = xhv.INSTANCE;
                        }
                        aVar = new RunnableC0045a();
                    } catch (Throwable unused) {
                        b.b(b.this).O(new ErrorResult("FILE_COPY_FAILED", "文件拷贝失败", (Map) null, 4, (a07) null));
                        aVar = new RunnableC0045a();
                    }
                    MegaUtils.A(aVar, 0L, 2, null);
                } catch (Throwable th) {
                    MegaUtils.A(new RunnableC0045a(), 0L, 2, null);
                    throw th;
                }
            }
        }

        static {
            t2o.a(106954766);
        }

        public b(FilePickerAbility filePickerAbility, t6c t6cVar) {
            ckf.g(t6cVar, "callback");
            this.g = t6cVar;
        }

        public static final /* synthetic */ t6c b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t6c) ipChange.ipc$dispatch("d92b8bfb", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static final /* synthetic */ WeakReference c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("ad417dbf", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static final /* synthetic */ ContentResolver d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContentResolver) ipChange.ipc$dispatch("b0725737", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static final /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ceed9c", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static final /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d036a279", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -857321247) {
                super.onActivityCreated((Activity) objArr[0], (Bundle) objArr[1]);
                return null;
            } else if (hashCode == 1257714799) {
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/ability/impl/file/FilePickerAbility$FilePickerAbilityCallback");
            }
        }

        public final void g(List<? extends Uri> list) {
            Activity activity;
            u6h a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5160edcf", new Object[]{this, list});
                return;
            }
            vii a3 = vii.a();
            WeakReference<Activity> weakReference = this.d;
            if (!(weakReference == null || (activity = weakReference.get()) == null || (a2 = u6h.a()) == null)) {
                a3.c(activity, a2, null);
            }
            ckf.f(a3, "MegaLoading.createInstan…          }\n            }");
            MegaUtils.C(new a(list, a3));
        }

        @Override // tb.ua0
        public void a(int i, int i2, Intent intent) {
            Activity activity;
            Activity activity2;
            ClipData clipData;
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                return;
            }
            super.a(i, i2, intent);
            if (i == this.f1944a && i2 == -1) {
                ArrayList arrayList = new ArrayList();
                if (!(intent == null || (data = intent.getData()) == null)) {
                    arrayList.add(data);
                }
                if (!(intent == null || (clipData = intent.getClipData()) == null)) {
                    int itemCount = clipData.getItemCount();
                    for (int i3 = 0; i3 < itemCount; i3++) {
                        ClipData.Item itemAt = clipData.getItemAt(i3);
                        ckf.f(itemAt, "it.getItemAt(i)");
                        Uri uri = itemAt.getUri();
                        ckf.f(uri, "it.getItemAt(i).uri");
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.g.O(new ErrorResult("CHOOSE_FILE_FAILED", "文件选择失败，没有获得数据", (Map) null, 4, (a07) null));
                    WeakReference<Activity> weakReference = this.d;
                    if (!(weakReference == null || (activity2 = weakReference.get()) == null)) {
                        activity2.finish();
                        return;
                    }
                    return;
                }
                g(arrayList);
                return;
            }
            this.g.onCancel();
            WeakReference<Activity> weakReference2 = this.d;
            if (!(weakReference2 == null || (activity = weakReference2.get()) == null)) {
                activity.finish();
            }
        }

        @Override // tb.ua0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            super.onActivityCreated(activity, bundle);
            this.d = new WeakReference<>(activity);
            this.b = activity.getContentResolver();
            String stringExtra = activity.getIntent().getStringExtra("sandbox");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.c = stringExtra;
            this.e = activity.getIntent().getBooleanExtra("multiple", false);
            if (TextUtils.isEmpty(this.c)) {
                this.g.O(ErrorResult.a.Companion.g("沙盒路径不存在"));
                activity.finish();
                return;
            }
            this.c += this.f;
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.setType("*/*");
            if (this.e) {
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
            try {
                activity.startActivityForResult(intent, this.f1944a);
            } catch (Throwable unused) {
                this.g.O(new ErrorResult("NO_EXIST_FILE_PICKER", "文件选择器不存在", (Map) null, 4, (a07) null));
                activity.finish();
            }
        }
    }
}
