package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f6l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CARD_GROUP_TAG = "CardGroupTag";
    public static final String POSITION_TAG = "PositionTag";
    public static final String TAG = "OperateUtils";

    static {
        t2o.a(83886224);
    }

    public static String a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("558820d8", new Object[]{iDMComponent, iDMComponent2});
        }
        String key = (iDMComponent == null || iDMComponent.getFields() == null || !"true".equals(iDMComponent.getCardGroup())) ? null : iDMComponent.getKey();
        return (iDMComponent2 == null || iDMComponent2.getExtMap() == null || iDMComponent2.getExtMap().get("CardGroupTag") == null || TextUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get("CardGroupTag")))) ? key : (String) iDMComponent2.getExtMap().get("CardGroupTag");
    }

    public static String[] b(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1814deb5", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("_")) > 0 && indexOf < str.length() - 1) {
            return new String[]{str.substring(0, indexOf), str.substring(indexOf + 1, str.length())};
        }
        return null;
    }

    public static IDMComponent c(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("eb8dc895", new Object[]{iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = zc4.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IDMComponent iDMComponent2 = (IDMComponent) it.next();
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public static IDMComponent d(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("86a39fa7", new Object[]{iDMComponent, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        List<IDMComponent> a2 = zc4.a(iDMComponent);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size++) {
            IDMComponent iDMComponent2 = (IDMComponent) arrayList.get(size);
            if (list.contains(iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    public static List<IDMComponent> e(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("599a88b1", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null && iDMComponent.isNormalComponent()) {
                arrayList.add(iDMComponent);
            }
        }
        return arrayList;
    }

    public static String f(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66ab54ba", new Object[]{iDMComponent, iDMComponent2});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null || iDMComponent.getPosition() == null) {
            str = null;
        } else {
            str = iDMComponent.getPosition();
        }
        if (iDMComponent2 == null || iDMComponent2.getExtMap() == null || iDMComponent2.getExtMap().get("PositionTag") == null || TextUtils.isEmpty(String.valueOf(iDMComponent2.getExtMap().get("PositionTag")))) {
            return str;
        }
        return (String) iDMComponent2.getExtMap().get("PositionTag");
    }

    public static void g(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4bea29", new Object[]{list});
        } else {
            h(list, null);
        }
    }

    public static void h(List<IDMComponent> list, ly<IDMComponent> lyVar) {
        int i;
        String str;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bfee68", new Object[]{list, lyVar});
            return;
        }
        List<IDMComponent> e = e(list);
        if (e != null) {
            String str2 = "";
            IDMComponent iDMComponent = null;
            int i3 = 1;
            while (true) {
                i = 16;
                if (i2 >= e.size() - 1) {
                    break;
                }
                iDMComponent = e.get(i2);
                if (lyVar != null) {
                    lyVar.a(iDMComponent);
                }
                if (!(iDMComponent.getExtMap() == null || (str = (String) iDMComponent.getExtMap().get("CardGroupTag")) == null)) {
                    str2 = (String) e.get(i2 + 1).getExtMap().get("CardGroupTag");
                    if (str.equals(str2)) {
                        if (1 == i3) {
                            iDMComponent.setCornerTypeFields(1);
                        }
                        i3++;
                    } else {
                        if (1 == i3) {
                            i = 17;
                        } else {
                            i3 = 1;
                        }
                        iDMComponent.setCornerTypeFields(i);
                    }
                }
                i2++;
            }
            if (1 == i3) {
                i = 17;
            }
            if (!TextUtils.isEmpty(str2)) {
                iDMComponent.setCornerTypeFields(i);
            }
        }
    }
}
