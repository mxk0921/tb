package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CursorToStringConverter mCursorToStringConverter;
    public int[] mFrom;
    public String[] mOriginalFrom;
    private int mStringConversionColumn = -1;
    public int[] mTo;
    private ViewBinder mViewBinder;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface CursorToStringConverter {
        CharSequence convertToString(Cursor cursor);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ViewBinder {
        boolean setViewValue(View view, Cursor cursor, int i);
    }

    @Deprecated
    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }

    private void findColumns(Cursor cursor, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b0f013", new Object[]{this, cursor, strArr});
        } else if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.mFrom;
            if (iArr == null || iArr.length != length) {
                this.mFrom = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.mFrom[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
        } else {
            this.mFrom = null;
        }
    }

    public static /* synthetic */ Object ipc$super(SimpleCursorAdapter simpleCursorAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1521206647) {
            return super.convertToString((Cursor) objArr[0]);
        }
        if (hashCode == -572192374) {
            super.changeCursor((Cursor) objArr[0]);
            return null;
        } else if (hashCode == 1981656142) {
            return super.swapCursor((Cursor) objArr[0]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/cursoradapter/widget/SimpleCursorAdapter");
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0758b8", new Object[]{this, view, context, cursor});
            return;
        }
        ViewBinder viewBinder = this.mViewBinder;
        int[] iArr = this.mTo;
        int length = iArr.length;
        int[] iArr2 = this.mFrom;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (viewBinder != null) {
                    z = viewBinder.setViewValue(findViewById, cursor, iArr2[i]);
                } else {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        setViewText((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        setViewImage((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                    }
                }
            }
        }
    }

    public void changeCursorAndColumns(Cursor cursor, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a333ee49", new Object[]{this, cursor, strArr, iArr});
            return;
        }
        this.mOriginalFrom = strArr;
        this.mTo = iArr;
        findColumns(cursor, strArr);
        super.changeCursor(cursor);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence convertToString(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a5543a89", new Object[]{this, cursor});
        }
        CursorToStringConverter cursorToStringConverter = this.mCursorToStringConverter;
        if (cursorToStringConverter != null) {
            return cursorToStringConverter.convertToString(cursor);
        }
        int i = this.mStringConversionColumn;
        if (i > -1) {
            return cursor.getString(i);
        }
        return super.convertToString(cursor);
    }

    public CursorToStringConverter getCursorToStringConverter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CursorToStringConverter) ipChange.ipc$dispatch("96cf0b2e", new Object[]{this});
        }
        return this.mCursorToStringConverter;
    }

    public int getStringConversionColumn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a71fe82d", new Object[]{this})).intValue();
        }
        return this.mStringConversionColumn;
    }

    public ViewBinder getViewBinder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewBinder) ipChange.ipc$dispatch("2350bd5e", new Object[]{this});
        }
        return this.mViewBinder;
    }

    public void setCursorToStringConverter(CursorToStringConverter cursorToStringConverter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa6e28c", new Object[]{this, cursorToStringConverter});
        } else {
            this.mCursorToStringConverter = cursorToStringConverter;
        }
    }

    public void setStringConversionColumn(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f59d7d", new Object[]{this, new Integer(i)});
        } else {
            this.mStringConversionColumn = i;
        }
    }

    public void setViewBinder(ViewBinder viewBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266cdc6c", new Object[]{this, viewBinder});
        } else {
            this.mViewBinder = viewBinder;
        }
    }

    public void setViewImage(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a687f", new Object[]{this, imageView, str});
            return;
        }
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void setViewText(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fee345b3", new Object[]{this, textView, str});
        } else {
            textView.setText(str);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("761dac4e", new Object[]{this, cursor});
        }
        findColumns(cursor, this.mOriginalFrom);
        return super.swapCursor(cursor);
    }

    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }
}
