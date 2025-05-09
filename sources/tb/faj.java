package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.android.favoritesdk.goods.response.ItemListModel;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class faj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f19141a = "favorite";

    static {
        t2o.a(1007681547);
    }

    public static final l29 a() {
        ItemListModel itemListModel;
        np Z;
        np L;
        fdb w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l29) ipChange.ipc$dispatch("f6830dc2", new Object[0]);
        }
        try {
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule("favorite_sdk");
            if (cacheForModule == null || (Z = cacheForModule.Z("kmpFav".getClass().getClassLoader())) == null || (L = Z.L(new op())) == null || (w = L.w()) == null) {
                itemListModel = null;
            } else {
                itemListModel = (ItemListModel) w.O("item_list_key-" + Login.getUserId(), ItemListModel.class);
            }
            if (itemListModel != null) {
                return new l29(new ArrayList(itemListModel.itemList), itemListModel.cacheTime);
            }
            return null;
        } catch (Throwable th) {
            Log.e("kmpFav", "getFavListFromDisk 异常" + th);
            return null;
        }
    }

    public static final int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34735ee6", new Object[]{str, new Integer(i)})).intValue();
        }
        ckf.g(str, "key");
        return Globals.getApplication().getSharedPreferences(f19141a, 0).getInt(str, i);
    }

    public static final void c(l29 l29Var) {
        np Z;
        np L;
        fdb w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddee2f3", new Object[]{l29Var});
            return;
        }
        ckf.g(l29Var, "data");
        try {
            np cacheForModule = AVFSCacheManager.getInstance().cacheForModule("favorite_sdk");
            if (cacheForModule != null && (Z = cacheForModule.Z("kmpFav".getClass().getClassLoader())) != null && (L = Z.L(new op())) != null && (w = L.w()) != null) {
                ItemListModel itemListModel = new ItemListModel();
                itemListModel.itemList = new HashSet<>(l29Var.b());
                itemListModel.cacheTime = l29Var.a();
                w.N("item_list_key-" + Login.getUserId(), itemListModel);
            }
        } catch (Throwable th) {
            Log.e("kmpFav", "setFavListToDisk 异常" + th);
        }
    }

    public static final void d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3301f6", new Object[]{str, new Integer(i)});
            return;
        }
        ckf.g(str, "key");
        Globals.getApplication().getSharedPreferences(f19141a, 0).edit().putInt(str, i).apply();
    }
}
