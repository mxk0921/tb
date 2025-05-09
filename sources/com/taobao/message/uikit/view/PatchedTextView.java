package com.taobao.message.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.view.ISelectionChanged;
import com.taobao.tao.log.TLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PatchedTextView extends AppCompatTextView implements ISelectionChanged {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PatchedTextView";
    private ISelectionChanged.SelectionChangedCallback callback;
    private int errorCount = 0;

    static {
        t2o.a(552599737);
        t2o.a(552599735);
    }

    public PatchedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(PatchedTextView patchedTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 358241672:
                super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1051100526:
                super.onSelectionChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1236261712:
                super.setGravity(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/uikit/view/PatchedTextView");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.onMeasure(i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (this.errorCount < 1) {
                this.errorCount++;
                setText(getText().toString());
            }
            TLog.loge(TAG, "1-onMeasure:", e);
            super.onMeasure(i, i2);
        } catch (Exception e2) {
            try {
                if (this.errorCount < 1) {
                    this.errorCount++;
                    setText(getText().toString());
                }
                TLog.loge(TAG, "2-onMeasure:", e2);
                super.onMeasure(i, i2);
            } catch (Exception e3) {
                super.onMeasure(i, i2);
                TLog.loge(TAG, "3-onMeasure:", e3);
            }
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea6856e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onSelectionChanged(i, i2);
        ISelectionChanged.SelectionChangedCallback selectionChangedCallback = this.callback;
        if (selectionChangedCallback != null) {
            selectionChangedCallback.onSelectionChanged(i, i2);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49afdb50", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setGravity(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                if (this.errorCount < 1) {
                    this.errorCount++;
                    setText(getText().toString());
                }
                TLog.loge(TAG, "1-setGravity:", e);
                super.setGravity(i);
            } catch (Exception e2) {
                super.setGravity(i);
                TLog.loge(TAG, "2-setGravity:", e2);
            }
        }
    }

    @Override // com.taobao.message.uikit.view.ISelectionChanged
    public void setOnSelectionChanged(ISelectionChanged.SelectionChangedCallback selectionChangedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1528add", new Object[]{this, selectionChangedCallback});
        } else {
            this.callback = selectionChangedCallback;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
            return;
        }
        try {
            super.setText(charSequence, bufferType);
        } catch (ArrayIndexOutOfBoundsException e) {
            if (this.errorCount < 1) {
                this.errorCount++;
                setText(getText().toString());
            }
            TLog.loge(TAG, "1-setText:", e);
        } catch (Exception e2) {
            try {
                if (this.errorCount < 1) {
                    this.errorCount++;
                    setText(getText().toString());
                }
                TLog.loge(TAG, "2-setText:", e2);
            } catch (Exception e3) {
                TLog.loge(TAG, "3-setText:", e3);
            }
        }
    }

    public PatchedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PatchedTextView(Context context) {
        super(context);
    }
}
