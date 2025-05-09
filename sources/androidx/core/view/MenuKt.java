package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.pg1;
import tb.sbp;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a7\u0010\u0014\u001a\u00020\n*\u00020\u00002!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001aL\u0010\u0017\u001a\u00020\n*\u00020\u000026\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0016H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001c\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001c\u0010\u001d\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030!*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "get", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", "item", "", "contains", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "Ltb/xhv;", "minusAssign", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "isEmpty", "(Landroid/view/Menu;)Z", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", pg1.ATOM_EXT_forEach, "(Landroid/view/Menu;Ltb/g1a;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/Menu;Ltb/u1a;)V", "", pg1.ATOM_EXT_iterator, "(Landroid/view/Menu;)Ljava/util/Iterator;", "removeItemAt", "(Landroid/view/Menu;I)V", "getSize", "(Landroid/view/Menu;)I", "size", "Ltb/sbp;", "getChildren", "(Landroid/view/Menu;)Ltb/sbp;", "children", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MenuKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f6a8897", new Object[]{menu, menuItem})).booleanValue();
        }
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (ckf.b(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, g1a<? super MenuItem, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c7b80d", new Object[]{menu, g1aVar});
            return;
        }
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            g1aVar.invoke(menu.getItem(i));
        }
    }

    public static final void forEachIndexed(Menu menu, u1a<? super Integer, ? super MenuItem, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae7530f", new Object[]{menu, u1aVar});
            return;
        }
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            u1aVar.invoke(Integer.valueOf(i), menu.getItem(i));
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuItem) ipChange.ipc$dispatch("883811fd", new Object[]{menu, new Integer(i)});
        }
        return menu.getItem(i);
    }

    public static final sbp<MenuItem> getChildren(final Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbp) ipChange.ipc$dispatch("ab6ab3c1", new Object[]{menu});
        }
        return new sbp<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sbp
            public Iterator<MenuItem> iterator() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Iterator) ipChange2.ipc$dispatch("8f345362", new Object[]{this});
                }
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9c0558d", new Object[]{menu})).intValue();
        }
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d422652", new Object[]{menu})).booleanValue();
        }
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b3e1f1", new Object[]{menu})).booleanValue();
        }
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("aa644ad4", new Object[]{menu});
        }
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6732ebf3", new Object[]{menu, menuItem});
        } else {
            menu.removeItem(menuItem.getItemId());
        }
    }

    public static final void removeItemAt(Menu menu, int i) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff77b7c", new Object[]{menu, new Integer(i)});
            return;
        }
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            xhvVar = xhv.INSTANCE;
        } else {
            xhvVar = null;
        }
        if (xhvVar == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
