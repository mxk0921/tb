package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.features.category.CategoryDataItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wf3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764411973);
    }

    public static List<lf3> a(CategoryDataItem[] categoryDataItemArr) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8e5d3e1", new Object[]{categoryDataItemArr});
        }
        ArrayList arrayList = new ArrayList();
        if (categoryDataItemArr != null && categoryDataItemArr.length > 0) {
            int i = -1;
            for (CategoryDataItem categoryDataItem : categoryDataItemArr) {
                CategoryDataItem[] categoryDataItemArr2 = categoryDataItem.subCats;
                if (categoryDataItemArr2 == null || categoryDataItemArr2.length == 0) {
                    i++;
                    arrayList.add(new lf3(categoryDataItem.id, categoryDataItem.name, categoryDataItem.mcatImg, categoryDataItem.imagePath, categoryDataItem.parID, 0, i, false));
                } else {
                    i++;
                    arrayList.add(new lf3(categoryDataItem.id, categoryDataItem.name, categoryDataItem.mcatImg, categoryDataItem.imagePath, categoryDataItem.parID, 1, i, false));
                    int i2 = 1;
                    int i3 = -1;
                    while (true) {
                        CategoryDataItem[] categoryDataItemArr3 = categoryDataItem.subCats;
                        if (i2 <= categoryDataItemArr3.length) {
                            i3++;
                            CategoryDataItem categoryDataItem2 = categoryDataItemArr3[i2 - 1];
                            if (i2 % 2 == 0 || categoryDataItemArr3.length != i2) {
                                z = false;
                            } else {
                                z = true;
                            }
                            arrayList.add(new lf3(categoryDataItem2.id, categoryDataItem2.name, categoryDataItem2.mcatImg, categoryDataItem2.imagePath, categoryDataItem2.parID, 2, i3, z));
                            i2++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
