package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import tb.w31;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AppCompatTextClassifierHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextClassifier mTextClassifier;
    private TextView mTextView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class Api26Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api26Impl() {
        }

        public static TextClassifier getTextClassifier(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextClassifier) ipChange.ipc$dispatch("537cf567", new Object[]{textView});
            }
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(TextView textView) {
        this.mTextView = (TextView) Preconditions.checkNotNull(textView);
    }

    public TextClassifier getTextClassifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return w31.a(ipChange.ipc$dispatch("e77bd975", new Object[]{this}));
        }
        TextClassifier textClassifier = this.mTextClassifier;
        return textClassifier == null ? Api26Impl.getTextClassifier(this.mTextView) : textClassifier;
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccad2221", new Object[]{this, textClassifier});
        } else {
            this.mTextClassifier = textClassifier;
        }
    }
}
