package com.example.android.archelon_sea_turtle_project.databinding;
import com.example.android.archelon_sea_turtle_project.R;
import com.example.android.archelon_sea_turtle_project.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SurveyStartFragmentBindingImpl extends SurveyStartFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.AreaText, 1);
        sViewsWithIds.put(R.id.datePicker, 2);
        sViewsWithIds.put(R.id.BeachText, 3);
        sViewsWithIds.put(R.id.SectorText, 4);
        sViewsWithIds.put(R.id.SubSectorText, 5);
        sViewsWithIds.put(R.id.EmergenceEventText, 6);
        sViewsWithIds.put(R.id.NestText, 7);
        sViewsWithIds.put(R.id.DistancetoSeaText, 8);
        sViewsWithIds.put(R.id.TrackTypeText, 9);
        sViewsWithIds.put(R.id.NonNestingAttemptsText, 10);
        sViewsWithIds.put(R.id.tagsText, 11);
        sViewsWithIds.put(R.id.CommentsText, 12);
        sViewsWithIds.put(R.id.photoIDText, 13);
        sViewsWithIds.put(R.id.NextButton, 14);
        sViewsWithIds.put(R.id.BackButton, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SurveyStartFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private SurveyStartFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[15]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[7]
            , (android.widget.Button) bindings[14]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[9]
            , (android.widget.DatePicker) bindings[2]
            , (android.widget.EditText) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.EditText) bindings[11]
            );
        this.surveyStartLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}