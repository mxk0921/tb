package androidx.constraintlayout.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class GridEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int VERTICAL = 1;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    private int mNextAvailableIndex = 0;
    private int mNumWidgets;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    private String mStrSkips;
    private String mStrSpans;

    public GridEngine() {
    }

    private void addAllConstraintPositions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1479cbb4", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mNumWidgets; i++) {
            if (leftOfWidget(i) == -1) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition != -1) {
                    addConstraintPosition(i, rowByIndex, colByIndex, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    private void addConstraintPosition(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40885155", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        int[] iArr = this.mConstraintMatrix[i];
        iArr[0] = i3;
        iArr[1] = i2;
        iArr[2] = (i3 + i5) - 1;
        iArr[3] = (i2 + i4) - 1;
    }

    private void fillConstraintMatrix(boolean z) {
        int[][] parseSpans;
        int[][] parseSpans2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b6082c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            for (int i = 0; i < this.mPositionMatrix.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.mConstraintMatrix.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr = this.mConstraintMatrix;
                    if (i4 < iArr[0].length) {
                        iArr[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.mNextAvailableIndex = 0;
        String str = this.mStrSkips;
        if (!(str == null || str.trim().isEmpty() || (parseSpans2 = parseSpans(this.mStrSkips)) == null)) {
            handleSkips(parseSpans2);
        }
        String str2 = this.mStrSpans;
        if (!(str2 == null || str2.trim().isEmpty() || (parseSpans = parseSpans(this.mStrSpans)) == null)) {
            handleSpans(parseSpans);
        }
        addAllConstraintPositions();
    }

    private int getColByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f1718de", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mOrientation == 1) {
            return i / this.mRows;
        }
        return i % this.mColumns;
    }

    private int getNextPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72cd32c", new Object[]{this})).intValue();
        }
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.mNextAvailableIndex;
            if (i >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z = true;
            }
            this.mNextAvailableIndex++;
        }
        return i;
    }

    private int getRowByIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2939a38", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mOrientation == 1) {
            return i % this.mRows;
        }
        return i / this.mColumns;
    }

    private void handleSkips(int[][] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147a3370", new Object[]{this, iArr});
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            int rowByIndex = getRowByIndex(iArr[i][0]);
            int colByIndex = getColByIndex(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void handleSpans(int[][] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321d4a3b", new Object[]{this, iArr});
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            int rowByIndex = getRowByIndex(iArr[i][0]);
            int colByIndex = getColByIndex(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                int[] iArr3 = iArr[i];
                addConstraintPosition(i, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
            } else {
                return;
            }
        }
    }

    private void initVariables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b627f34e", new Object[]{this});
            return;
        }
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.mNumWidgets;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean invalidatePositions(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71cde03a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isSpansValid(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b98f8a8c", new Object[]{this, charSequence})).booleanValue();
        }
        if (charSequence == null) {
            return false;
        }
        return true;
    }

    private void updateActualRowsAndColumns() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477025dd", new Object[]{this});
            return;
        }
        int i2 = this.mRowsSet;
        if (i2 == 0 || (i = this.mColumnsSet) == 0) {
            int i3 = this.mColumnsSet;
            if (i3 > 0) {
                this.mColumns = i3;
                this.mRows = ((this.mNumWidgets + i3) - 1) / i3;
            } else if (i2 > 0) {
                this.mRows = i2;
                this.mColumns = ((this.mNumWidgets + i2) - 1) / i2;
            } else {
                int sqrt = (int) (Math.sqrt(this.mNumWidgets) + 1.5d);
                this.mRows = sqrt;
                this.mColumns = ((this.mNumWidgets + sqrt) - 1) / sqrt;
            }
        } else {
            this.mRows = i2;
            this.mColumns = i;
        }
    }

    public int bottomOfWidget(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("afe400c9", new Object[]{this, new Integer(i)})).intValue();
        }
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][3];
    }

    public void setColumns(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af00d721", new Object[]{this, new Integer(i)});
        } else if (i <= 50 && this.mColumnsSet != i) {
            this.mColumnsSet = i;
            updateActualRowsAndColumns();
        }
    }

    public void setNumWidgets(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0eb7f1", new Object[]{this, new Integer(i)});
        } else if (i <= this.mRows * this.mColumns) {
            this.mNumWidgets = i;
        }
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else if ((i == 0 || i == 1) && this.mOrientation != i) {
            this.mOrientation = i;
        }
    }

    public void setRows(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb6ee1", new Object[]{this, new Integer(i)});
        } else if (i <= 50 && this.mRowsSet != i) {
            this.mRowsSet = i;
            updateActualRowsAndColumns();
        }
    }

    public void setSkips(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78ceca3", new Object[]{this, str});
            return;
        }
        String str2 = this.mStrSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mStrSkips = str;
        }
    }

    public void setSpans(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61f006d2", new Object[]{this, charSequence});
            return;
        }
        String str = this.mStrSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mStrSpans = charSequence.toString();
        }
    }

    public void setup() {
        boolean[][] zArr;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        int[][] iArr = this.mConstraintMatrix;
        if (iArr != null && iArr.length == this.mNumWidgets && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z = true;
        }
        if (!z) {
            initVariables();
        }
        fillConstraintMatrix(z);
    }

    public int leftOfWidget(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8606d", new Object[]{this, new Integer(i)})).intValue();
        }
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][0];
    }

    public GridEngine(int i, int i2) {
        this.mRowsSet = i;
        this.mColumnsSet = i2;
        if (i > 50) {
            this.mRowsSet = 3;
        }
        if (i2 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initVariables();
    }

    public int rightOfWidget(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebc0878", new Object[]{this, new Integer(i)})).intValue();
        }
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][2];
    }

    public int topOfWidget(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d20a4ddf", new Object[]{this, new Integer(i)})).intValue();
        }
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][1];
    }

    private int[][] parseSpans(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[][]) ipChange.ipc$dispatch("ecef15da", new Object[]{this, str});
        }
        if (!isSpansValid(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, split.length, 3);
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].trim().split(":");
            String[] split3 = split2[1].split("x");
            iArr[i][0] = Integer.parseInt(split2[0]);
            iArr[i][1] = Integer.parseInt(split3[0]);
            iArr[i][2] = Integer.parseInt(split3[1]);
        }
        return iArr;
    }

    public GridEngine(int i, int i2, int i3) {
        this.mRowsSet = i;
        this.mColumnsSet = i2;
        this.mNumWidgets = i3;
        if (i > 50) {
            this.mRowsSet = 3;
        }
        if (i2 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        int i4 = this.mRows;
        int i5 = this.mColumns;
        if (i3 > i4 * i5 || i3 < 1) {
            this.mNumWidgets = i4 * i5;
        }
        initVariables();
        fillConstraintMatrix(false);
    }
}
