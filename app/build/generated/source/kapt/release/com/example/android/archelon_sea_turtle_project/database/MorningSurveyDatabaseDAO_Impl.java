package com.example.android.archelon_sea_turtle_project.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class MorningSurveyDatabaseDAO_Impl implements MorningSurveyDatabaseDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMorningSurvey;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public MorningSurveyDatabaseDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMorningSurvey = new EntityInsertionAdapter<MorningSurvey>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Morning_survey_table`(`area`,`date`,`beach`,`sector`,`subsector`,`emergence_event`,`nest`,`distance_to_sea`,`track_type`,`non_nesting_attempts`,`gps_latitude`,`gps_longitude`,`tags`,`Tests`,`myphoto`,`nest_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MorningSurvey value) {
        if (value.getArea() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArea());
        }
        if (value.getDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate());
        }
        if (value.getBeach() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBeach());
        }
        if (value.getSector() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSector());
        }
        if (value.getSubsector() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSubsector());
        }
        if (value.getEmergence_event() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmergence_event());
        }
        if (value.getNest() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNest());
        }
        if (value.getDistance_to_sea() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDistance_to_sea());
        }
        if (value.getTrack_type() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTrack_type());
        }
        if (value.getNon_nesting_attempts() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getNon_nesting_attempts());
        }
        if (value.getGps_latitude() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getGps_latitude());
        }
        if (value.getGps_longitude() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getGps_longitude());
        }
        if (value.getTags() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTags());
        }
        if (value.getComments() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getComments());
        }
        if (value.getPhoto_id() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getPhoto_id());
        }
        stmt.bindLong(16, value.getNest_id());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Morning_survey_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(MorningSurvey moringSurvey) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMorningSurvey.insert(moringSurvey);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(MorningSurvey moringSurvey) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMorningSurvey.insert(moringSurvey);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public MorningSurvey get(long key) {
    final String _sql = "SELECT * from Morning_survey_table WHERE nest_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfArea = _cursor.getColumnIndexOrThrow("area");
      final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
      final int _cursorIndexOfBeach = _cursor.getColumnIndexOrThrow("beach");
      final int _cursorIndexOfSector = _cursor.getColumnIndexOrThrow("sector");
      final int _cursorIndexOfSubsector = _cursor.getColumnIndexOrThrow("subsector");
      final int _cursorIndexOfEmergenceEvent = _cursor.getColumnIndexOrThrow("emergence_event");
      final int _cursorIndexOfNest = _cursor.getColumnIndexOrThrow("nest");
      final int _cursorIndexOfDistanceToSea = _cursor.getColumnIndexOrThrow("distance_to_sea");
      final int _cursorIndexOfTrackType = _cursor.getColumnIndexOrThrow("track_type");
      final int _cursorIndexOfNonNestingAttempts = _cursor.getColumnIndexOrThrow("non_nesting_attempts");
      final int _cursorIndexOfGpsLatitude = _cursor.getColumnIndexOrThrow("gps_latitude");
      final int _cursorIndexOfGpsLongitude = _cursor.getColumnIndexOrThrow("gps_longitude");
      final int _cursorIndexOfTags = _cursor.getColumnIndexOrThrow("tags");
      final int _cursorIndexOfComments = _cursor.getColumnIndexOrThrow("Tests");
      final int _cursorIndexOfPhotoId = _cursor.getColumnIndexOrThrow("myphoto");
      final int _cursorIndexOfNestId = _cursor.getColumnIndexOrThrow("nest_id");
      final MorningSurvey _result;
      if(_cursor.moveToFirst()) {
        _result = new MorningSurvey();
        final String _tmpArea;
        _tmpArea = _cursor.getString(_cursorIndexOfArea);
        _result.setArea(_tmpArea);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        _result.setDate(_tmpDate);
        final String _tmpBeach;
        _tmpBeach = _cursor.getString(_cursorIndexOfBeach);
        _result.setBeach(_tmpBeach);
        final String _tmpSector;
        _tmpSector = _cursor.getString(_cursorIndexOfSector);
        _result.setSector(_tmpSector);
        final String _tmpSubsector;
        _tmpSubsector = _cursor.getString(_cursorIndexOfSubsector);
        _result.setSubsector(_tmpSubsector);
        final String _tmpEmergence_event;
        _tmpEmergence_event = _cursor.getString(_cursorIndexOfEmergenceEvent);
        _result.setEmergence_event(_tmpEmergence_event);
        final String _tmpNest;
        _tmpNest = _cursor.getString(_cursorIndexOfNest);
        _result.setNest(_tmpNest);
        final String _tmpDistance_to_sea;
        _tmpDistance_to_sea = _cursor.getString(_cursorIndexOfDistanceToSea);
        _result.setDistance_to_sea(_tmpDistance_to_sea);
        final String _tmpTrack_type;
        _tmpTrack_type = _cursor.getString(_cursorIndexOfTrackType);
        _result.setTrack_type(_tmpTrack_type);
        final String _tmpNon_nesting_attempts;
        _tmpNon_nesting_attempts = _cursor.getString(_cursorIndexOfNonNestingAttempts);
        _result.setNon_nesting_attempts(_tmpNon_nesting_attempts);
        final String _tmpGps_latitude;
        _tmpGps_latitude = _cursor.getString(_cursorIndexOfGpsLatitude);
        _result.setGps_latitude(_tmpGps_latitude);
        final String _tmpGps_longitude;
        _tmpGps_longitude = _cursor.getString(_cursorIndexOfGpsLongitude);
        _result.setGps_longitude(_tmpGps_longitude);
        final String _tmpTags;
        _tmpTags = _cursor.getString(_cursorIndexOfTags);
        _result.setTags(_tmpTags);
        final String _tmpComments;
        _tmpComments = _cursor.getString(_cursorIndexOfComments);
        _result.setComments(_tmpComments);
        final String _tmpPhoto_id;
        _tmpPhoto_id = _cursor.getString(_cursorIndexOfPhotoId);
        _result.setPhoto_id(_tmpPhoto_id);
        final long _tmpNest_id;
        _tmpNest_id = _cursor.getLong(_cursorIndexOfNestId);
        _result.setNest_id(_tmpNest_id);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public MorningSurvey getrecentSurvey() {
    final String _sql = "SELECT * FROM Morning_survey_table ORDER BY nest_id DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfArea = _cursor.getColumnIndexOrThrow("area");
      final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
      final int _cursorIndexOfBeach = _cursor.getColumnIndexOrThrow("beach");
      final int _cursorIndexOfSector = _cursor.getColumnIndexOrThrow("sector");
      final int _cursorIndexOfSubsector = _cursor.getColumnIndexOrThrow("subsector");
      final int _cursorIndexOfEmergenceEvent = _cursor.getColumnIndexOrThrow("emergence_event");
      final int _cursorIndexOfNest = _cursor.getColumnIndexOrThrow("nest");
      final int _cursorIndexOfDistanceToSea = _cursor.getColumnIndexOrThrow("distance_to_sea");
      final int _cursorIndexOfTrackType = _cursor.getColumnIndexOrThrow("track_type");
      final int _cursorIndexOfNonNestingAttempts = _cursor.getColumnIndexOrThrow("non_nesting_attempts");
      final int _cursorIndexOfGpsLatitude = _cursor.getColumnIndexOrThrow("gps_latitude");
      final int _cursorIndexOfGpsLongitude = _cursor.getColumnIndexOrThrow("gps_longitude");
      final int _cursorIndexOfTags = _cursor.getColumnIndexOrThrow("tags");
      final int _cursorIndexOfComments = _cursor.getColumnIndexOrThrow("Tests");
      final int _cursorIndexOfPhotoId = _cursor.getColumnIndexOrThrow("myphoto");
      final int _cursorIndexOfNestId = _cursor.getColumnIndexOrThrow("nest_id");
      final MorningSurvey _result;
      if(_cursor.moveToFirst()) {
        _result = new MorningSurvey();
        final String _tmpArea;
        _tmpArea = _cursor.getString(_cursorIndexOfArea);
        _result.setArea(_tmpArea);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        _result.setDate(_tmpDate);
        final String _tmpBeach;
        _tmpBeach = _cursor.getString(_cursorIndexOfBeach);
        _result.setBeach(_tmpBeach);
        final String _tmpSector;
        _tmpSector = _cursor.getString(_cursorIndexOfSector);
        _result.setSector(_tmpSector);
        final String _tmpSubsector;
        _tmpSubsector = _cursor.getString(_cursorIndexOfSubsector);
        _result.setSubsector(_tmpSubsector);
        final String _tmpEmergence_event;
        _tmpEmergence_event = _cursor.getString(_cursorIndexOfEmergenceEvent);
        _result.setEmergence_event(_tmpEmergence_event);
        final String _tmpNest;
        _tmpNest = _cursor.getString(_cursorIndexOfNest);
        _result.setNest(_tmpNest);
        final String _tmpDistance_to_sea;
        _tmpDistance_to_sea = _cursor.getString(_cursorIndexOfDistanceToSea);
        _result.setDistance_to_sea(_tmpDistance_to_sea);
        final String _tmpTrack_type;
        _tmpTrack_type = _cursor.getString(_cursorIndexOfTrackType);
        _result.setTrack_type(_tmpTrack_type);
        final String _tmpNon_nesting_attempts;
        _tmpNon_nesting_attempts = _cursor.getString(_cursorIndexOfNonNestingAttempts);
        _result.setNon_nesting_attempts(_tmpNon_nesting_attempts);
        final String _tmpGps_latitude;
        _tmpGps_latitude = _cursor.getString(_cursorIndexOfGpsLatitude);
        _result.setGps_latitude(_tmpGps_latitude);
        final String _tmpGps_longitude;
        _tmpGps_longitude = _cursor.getString(_cursorIndexOfGpsLongitude);
        _result.setGps_longitude(_tmpGps_longitude);
        final String _tmpTags;
        _tmpTags = _cursor.getString(_cursorIndexOfTags);
        _result.setTags(_tmpTags);
        final String _tmpComments;
        _tmpComments = _cursor.getString(_cursorIndexOfComments);
        _result.setComments(_tmpComments);
        final String _tmpPhoto_id;
        _tmpPhoto_id = _cursor.getString(_cursorIndexOfPhotoId);
        _result.setPhoto_id(_tmpPhoto_id);
        final long _tmpNest_id;
        _tmpNest_id = _cursor.getLong(_cursorIndexOfNestId);
        _result.setNest_id(_tmpNest_id);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<MorningSurvey>> getAllNights() {
    final String _sql = "SELECT * FROM Morning_survey_table ORDER BY nest_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<MorningSurvey>>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected List<MorningSurvey> compute() {
        if (_observer == null) {
          _observer = new Observer("Morning_survey_table") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfArea = _cursor.getColumnIndexOrThrow("area");
          final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
          final int _cursorIndexOfBeach = _cursor.getColumnIndexOrThrow("beach");
          final int _cursorIndexOfSector = _cursor.getColumnIndexOrThrow("sector");
          final int _cursorIndexOfSubsector = _cursor.getColumnIndexOrThrow("subsector");
          final int _cursorIndexOfEmergenceEvent = _cursor.getColumnIndexOrThrow("emergence_event");
          final int _cursorIndexOfNest = _cursor.getColumnIndexOrThrow("nest");
          final int _cursorIndexOfDistanceToSea = _cursor.getColumnIndexOrThrow("distance_to_sea");
          final int _cursorIndexOfTrackType = _cursor.getColumnIndexOrThrow("track_type");
          final int _cursorIndexOfNonNestingAttempts = _cursor.getColumnIndexOrThrow("non_nesting_attempts");
          final int _cursorIndexOfGpsLatitude = _cursor.getColumnIndexOrThrow("gps_latitude");
          final int _cursorIndexOfGpsLongitude = _cursor.getColumnIndexOrThrow("gps_longitude");
          final int _cursorIndexOfTags = _cursor.getColumnIndexOrThrow("tags");
          final int _cursorIndexOfComments = _cursor.getColumnIndexOrThrow("Tests");
          final int _cursorIndexOfPhotoId = _cursor.getColumnIndexOrThrow("myphoto");
          final int _cursorIndexOfNestId = _cursor.getColumnIndexOrThrow("nest_id");
          final List<MorningSurvey> _result = new ArrayList<MorningSurvey>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MorningSurvey _item;
            _item = new MorningSurvey();
            final String _tmpArea;
            _tmpArea = _cursor.getString(_cursorIndexOfArea);
            _item.setArea(_tmpArea);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            _item.setDate(_tmpDate);
            final String _tmpBeach;
            _tmpBeach = _cursor.getString(_cursorIndexOfBeach);
            _item.setBeach(_tmpBeach);
            final String _tmpSector;
            _tmpSector = _cursor.getString(_cursorIndexOfSector);
            _item.setSector(_tmpSector);
            final String _tmpSubsector;
            _tmpSubsector = _cursor.getString(_cursorIndexOfSubsector);
            _item.setSubsector(_tmpSubsector);
            final String _tmpEmergence_event;
            _tmpEmergence_event = _cursor.getString(_cursorIndexOfEmergenceEvent);
            _item.setEmergence_event(_tmpEmergence_event);
            final String _tmpNest;
            _tmpNest = _cursor.getString(_cursorIndexOfNest);
            _item.setNest(_tmpNest);
            final String _tmpDistance_to_sea;
            _tmpDistance_to_sea = _cursor.getString(_cursorIndexOfDistanceToSea);
            _item.setDistance_to_sea(_tmpDistance_to_sea);
            final String _tmpTrack_type;
            _tmpTrack_type = _cursor.getString(_cursorIndexOfTrackType);
            _item.setTrack_type(_tmpTrack_type);
            final String _tmpNon_nesting_attempts;
            _tmpNon_nesting_attempts = _cursor.getString(_cursorIndexOfNonNestingAttempts);
            _item.setNon_nesting_attempts(_tmpNon_nesting_attempts);
            final String _tmpGps_latitude;
            _tmpGps_latitude = _cursor.getString(_cursorIndexOfGpsLatitude);
            _item.setGps_latitude(_tmpGps_latitude);
            final String _tmpGps_longitude;
            _tmpGps_longitude = _cursor.getString(_cursorIndexOfGpsLongitude);
            _item.setGps_longitude(_tmpGps_longitude);
            final String _tmpTags;
            _tmpTags = _cursor.getString(_cursorIndexOfTags);
            _item.setTags(_tmpTags);
            final String _tmpComments;
            _tmpComments = _cursor.getString(_cursorIndexOfComments);
            _item.setComments(_tmpComments);
            final String _tmpPhoto_id;
            _tmpPhoto_id = _cursor.getString(_cursorIndexOfPhotoId);
            _item.setPhoto_id(_tmpPhoto_id);
            final long _tmpNest_id;
            _tmpNest_id = _cursor.getLong(_cursorIndexOfNestId);
            _item.setNest_id(_tmpNest_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
