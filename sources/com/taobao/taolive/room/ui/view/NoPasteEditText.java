package com.taobao.taolive.room.ui.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NoPasteEditText extends EditText {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MIN_PASTE_LENGTH = 10;
    private String mClipText;
    private int mEnd;
    private int mStart;
    private boolean mbPaste = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ActionMode.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(NoPasteEditText noPasteEditText) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cb43f5b1", new Object[]{this, actionMode, menuItem})).booleanValue();
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e072c179", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a57b0823", new Object[]{this, actionMode});
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cae505a6", new Object[]{this, actionMode, menu})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            } else if (NoPasteEditText.access$100(NoPasteEditText.this)) {
                NoPasteEditText.access$102(NoPasteEditText.this, false);
                editable.delete(NoPasteEditText.access$200(NoPasteEditText.this), NoPasteEditText.access$300(NoPasteEditText.this));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            int i4 = i3 + i;
            if (charSequence.subSequence(i, i4).toString().equals(NoPasteEditText.access$000(NoPasteEditText.this))) {
                NoPasteEditText.access$102(NoPasteEditText.this, true);
                NoPasteEditText.access$202(NoPasteEditText.this, i);
                NoPasteEditText.access$302(NoPasteEditText.this, i4);
            }
        }
    }

    static {
        t2o.a(806355831);
    }

    public NoPasteEditText(Context context) {
        super(context);
        onCreate();
    }

    public static /* synthetic */ String access$000(NoPasteEditText noPasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0c61ef0", new Object[]{noPasteEditText});
        }
        return noPasteEditText.mClipText;
    }

    public static /* synthetic */ boolean access$100(NoPasteEditText noPasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7540fe93", new Object[]{noPasteEditText})).booleanValue();
        }
        return noPasteEditText.mbPaste;
    }

    public static /* synthetic */ boolean access$102(NoPasteEditText noPasteEditText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("858830ab", new Object[]{noPasteEditText, new Boolean(z)})).booleanValue();
        }
        noPasteEditText.mbPaste = z;
        return z;
    }

    public static /* synthetic */ int access$200(NoPasteEditText noPasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76775161", new Object[]{noPasteEditText})).intValue();
        }
        return noPasteEditText.mStart;
    }

    public static /* synthetic */ int access$202(NoPasteEditText noPasteEditText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab1bf9ca", new Object[]{noPasteEditText, new Integer(i)})).intValue();
        }
        noPasteEditText.mStart = i;
        return i;
    }

    public static /* synthetic */ int access$300(NoPasteEditText noPasteEditText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77ada440", new Object[]{noPasteEditText})).intValue();
        }
        return noPasteEditText.mEnd;
    }

    public static /* synthetic */ int access$302(NoPasteEditText noPasteEditText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0b002cb", new Object[]{noPasteEditText, new Integer(i)})).intValue();
        }
        noPasteEditText.mEnd = i;
        return i;
    }

    public static /* synthetic */ Object ipc$super(NoPasteEditText noPasteEditText, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/NoPasteEditText");
    }

    private void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        setLongClickable(false);
        setTextIsSelectable(false);
        setCustomSelectionActionModeCallback(new a(this));
        addTextChangedListener(new b());
    }

    public void onResume() {
        ClipData.Item itemAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        try {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && itemAt.getText() != null) {
                String charSequence = itemAt.getText().toString();
                this.mClipText = charSequence;
                if (charSequence.length() < 10) {
                    this.mClipText = "";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f529f1eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return true;
    }

    public NoPasteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onCreate();
    }

    public NoPasteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onCreate();
    }
}
