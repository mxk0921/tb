package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TableLayoutBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_COLUMNS = 20;
    private static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

    private static SparseBooleanArray parseColumns(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseBooleanArray) ipChange.ipc$dispatch("1cabedc8", new Object[]{charSequence});
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String str : sColumnPattern.split(charSequence)) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    sparseBooleanArray.put(parseInt, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    public static void setCollapseColumns(TableLayout tableLayout, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b7949b", new Object[]{tableLayout, charSequence});
            return;
        }
        SparseBooleanArray parseColumns = parseColumns(charSequence);
        for (int i = 0; i < 20; i++) {
            boolean z = parseColumns.get(i, false);
            if (z != tableLayout.isColumnCollapsed(i)) {
                tableLayout.setColumnCollapsed(i, z);
            }
        }
    }

    public static void setShrinkColumns(TableLayout tableLayout, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e190ce3f", new Object[]{tableLayout, charSequence});
        } else if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setShrinkAllColumns(false);
            SparseBooleanArray parseColumns = parseColumns(charSequence);
            int size = parseColumns.size();
            for (int i = 0; i < size; i++) {
                int keyAt = parseColumns.keyAt(i);
                boolean valueAt = parseColumns.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnShrinkable(keyAt, valueAt);
                }
            }
        } else {
            tableLayout.setShrinkAllColumns(true);
        }
    }

    public static void setStretchColumns(TableLayout tableLayout, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3207407", new Object[]{tableLayout, charSequence});
        } else if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setStretchAllColumns(false);
            SparseBooleanArray parseColumns = parseColumns(charSequence);
            int size = parseColumns.size();
            for (int i = 0; i < size; i++) {
                int keyAt = parseColumns.keyAt(i);
                boolean valueAt = parseColumns.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnStretchable(keyAt, valueAt);
                }
            }
        } else {
            tableLayout.setStretchAllColumns(true);
        }
    }
}
