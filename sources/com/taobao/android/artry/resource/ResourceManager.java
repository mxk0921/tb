package com.taobao.android.artry.resource;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.resource.a;
import com.taobao.android.artry.resource.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.clv;
import tb.dxv;
import tb.joh;
import tb.rv2;
import tb.t2o;
import tb.xao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ResourceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public File f6379a;
    public final Object b;
    public boolean c;
    public Context d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ResourceType {
        IMAGE,
        SO,
        MODEL,
        EFFECT,
        AR_PLAYER,
        ZIP_FILE,
        GRAPH_FILE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ResourceType resourceType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/resource/ResourceManager$ResourceType");
        }

        public static ResourceType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceType) ipChange.ipc$dispatch("3b5570b6", new Object[]{str});
            }
            return (ResourceType) Enum.valueOf(ResourceType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends LruCache<String, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ResourceManager resourceManager, int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/resource/ResourceManager$1");
        }

        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8966fff8", new Object[]{this, str, bitmap})).intValue();
            }
            return bitmap.getByteCount();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType;

        static {
            int[] iArr = new int[ResourceType.values().length];
            $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType = iArr;
            try {
                iArr[ResourceType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType[ResourceType.SO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType[ResourceType.MODEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType[ResourceType.EFFECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType[ResourceType.AR_PLAYER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType[ResourceType.ZIP_FILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType[ResourceType.GRAPH_FILE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final rv2<List<clv>> f6380a;

        static {
            t2o.a(396361803);
            t2o.a(396361810);
        }

        public /* synthetic */ c(ResourceManager resourceManager, rv2 rv2Var, a aVar) {
            this(resourceManager, rv2Var);
        }

        public void a(List<clv> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4056827", new Object[]{this, list});
            } else {
                xao.b(true, ResultCode.SUCCESS, list, this.f6380a);
            }
        }

        public c(ResourceManager resourceManager, rv2<List<clv>> rv2Var) {
            this.f6380a = rv2Var;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ResourceManager f6381a = new ResourceManager(null);

        static {
            t2o.a(396361805);
        }

        public static /* synthetic */ ResourceManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceManager) ipChange.ipc$dispatch("4df4df72", new Object[0]);
            }
            return f6381a;
        }
    }

    static {
        t2o.a(396361800);
    }

    public /* synthetic */ ResourceManager(a aVar) {
        this();
    }

    public static ResourceManager d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceManager) ipChange.ipc$dispatch("c72bf44d", new Object[0]);
        }
        return d.a();
    }

    public File a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("33e1064d", new Object[]{this, str});
        }
        if (!h() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(this.f6379a, str);
        if (file.exists()) {
            return file;
        }
        file.mkdirs();
        return file;
    }

    public com.taobao.android.artry.resource.a b(List<ResourceType> list, String str, List<String> list2, a.f fVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.artry.resource.a) ipChange.ipc$dispatch("c5f4610e", new Object[]{this, list, str, list2, fVar});
        }
        if (h() && !TextUtils.isEmpty(str) && !dxv.h(list2)) {
            try {
                a.e eVar = new a.e(str, this.f6379a.getAbsolutePath());
                for (String str2 : list2) {
                    if (dxv.j(str2)) {
                        String c2 = c(str2);
                        String e = e(list.get(i));
                        eVar.f(str2, e + File.separator + c2);
                    }
                    i++;
                }
                eVar.h(fVar);
                com.taobao.android.artry.resource.a g = eVar.g();
                g.b();
                return g;
            } catch (Throwable th) {
                Log.e("ResourceManager", "downloadResource failed..." + th);
            }
        }
        return null;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3268b7f3", new Object[]{this, str});
        }
        if (!dxv.j(str)) {
            return null;
        }
        String b2 = joh.b(str);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        return "artry_" + b2;
    }

    public final String e(ResourceType resourceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51fc822b", new Object[]{this, resourceType});
        }
        if (resourceType != null) {
            switch (b.$SwitchMap$com$taobao$android$artry$resource$ResourceManager$ResourceType[resourceType.ordinal()]) {
                case 1:
                    return "images";
                case 2:
                    return "so_files";
                case 3:
                    return "model_files";
                case 4:
                    return "effect_files";
                case 5:
                    return "ar_player_files";
                case 6:
                    return "zip_files";
                case 7:
                    return "graph_files";
            }
        }
        return null;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a095b77e", new Object[]{this, context});
        } else {
            g(context, 3145728);
        }
    }

    public void g(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7221ab45", new Object[]{this, context, new Integer(i)});
        } else if (context != null) {
            synchronized (this.b) {
                try {
                    if (!this.c) {
                        this.c = true;
                        this.d = context.getApplicationContext();
                        this.f6379a = new File(this.d.getCacheDir(), "ARTry_cache");
                        if (i <= 0) {
                            i = 3145728;
                        }
                        new a(this, i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean h() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        synchronized (this.b) {
            z = this.c;
        }
        return z;
    }

    public void i(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be06179", new Object[]{this, str, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(ResourceType.IMAGE);
            }
        }
        b(arrayList, str, list, new com.taobao.android.artry.resource.b());
    }

    public void j(List<clv> list, rv2<List<clv>> rv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc4eef1", new Object[]{this, list, rv2Var});
        } else if (dxv.h(list)) {
            xao.d(false, rv2Var);
        } else {
            com.taobao.android.artry.resource.d.a().b(this.d);
            com.taobao.android.artry.resource.d.a().d(list, new c(this, rv2Var, null));
        }
    }

    public ResourceManager() {
        this.b = new Object();
        this.c = false;
    }
}
